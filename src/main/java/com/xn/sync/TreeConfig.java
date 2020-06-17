package com.xn.sync;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.springframework.util.ResourceUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/11/7.
 */
public class TreeConfig {
    public List<String> ids ;
    public List<String> classes ;

    public TreeConfig() {
        ids = new ArrayList<String>() ;
        classes = new ArrayList<String>() ;
    }
    public boolean parseConfig(){
        try {
            URL configUrl= ResourceUtils.getFile("classpath:Tree.xml").toURL();
            this.parse(this.createDom(configUrl));
            return true;
        } catch (Exception e) {
            System.out.println("处理器配置出错 !");
            e.printStackTrace();
            return false;
        }
    }
    public Document createDom(URL configFileURL){
        SAXBuilder builder=new SAXBuilder();
        Document document=null;
        try {
            document= builder.build(configFileURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return document;
    }
    private void parse(Document doc) throws Exception {//得到根元素
        Element rootElement = doc.getRootElement();
        List<Element> task = rootElement.getChildren("task");
        if(task == null || task.size() == 0){
            throw new Exception("未得到处理器配置文件根任务task!");
        }
        if(task.size() > 1){
            throw new Exception("未得到处理器配置文件根任务task必须只有一个!");
        }
        Tree.Node rootNode = new Tree().new Node();
        Tree.root = rootNode ;
        this.parseNode(task.get(0), rootNode) ;
    }
    private void parseNode(Element ele , Tree.Node node)throws Exception {
//		<task id="task2.1" name="构造数据" enable="true" class="" />
        if(ele == null){
            throw new Exception("分析处理器配置文件出错！");
        }

        String id = ele.getAttributeValue("id") ;
        if(id == null || id.trim().equals("")){
            throw new Exception("处理器配置文件中id必须配置！");
        }
        id = id.trim() ;
        if(ids.contains(id)){
            throw new Exception("处理器配置文件中id=" + id + "重复配置！");
        }
        node.id = id ;
        ids.add(id) ;

        String name = ele.getAttributeValue("name") ;
        if(name == null || name.trim().equals("")){
            throw new Exception("处理器配置文件中name必须配置！");
        }
        name = name.trim() ;
        node.name = name ;

        String enable = ele.getAttributeValue("enable") ;
        if(enable == null || !(enable.trim().equals("true") || enable.trim().equals("false"))){
            throw new Exception("处理器配置文件中enable必须配置，并且值只能为true或false！");
        }
        if(enable.trim().equals("true")){
            node.enable = true ;
        }
        if(enable.trim().equals("false")){
            node.enable = false ;
        }

        String clazz = ele.getAttributeValue("class") ;
        if(clazz == null || clazz.trim().equals("")){
            throw new Exception("处理器配置文件中class必须配置！");
        }
        clazz = clazz.trim() ;
        if(classes.contains(clazz)){
            throw new Exception("处理器配置文件中class=" + clazz + "重复配置！");
        }
        node.clazz = clazz ;
        classes.add(clazz) ;
        this.checkClass(node.clazz) ;

        this.parseSubNode(ele , node) ;

    }
    @SuppressWarnings("unchecked")
    private void parseSubNode(Element ele , Tree.Node node)throws Exception {
        List list = ele.getChildren("task") ;
        if(list != null && list.size() > 0){
            node.branchs = new Tree.Node[list.size()] ;
            Iterator it = list.iterator();
            Element e = null;
            int count = 0 ;
            Tree.Node subNode ;
            while(it.hasNext()){
                e = (Element) it.next();
                subNode = new Tree().new Node() ;
                node.branchs[count++] = subNode ;
                parseNode(e , subNode) ;
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void checkClass(String clazz)throws Exception {
        Class c = Class.forName(clazz);
        if (c == null) {
            throw new Exception("处理器配置文件中不能实例化class=" + clazz + "！");
        }else{
            Object o = c.newInstance();
            if(o instanceof Task){
            }else{
                throw new Exception("处理器配置文件中class=" + clazz + "必须实现Task接口！");
            }
        }
    }
}
