package com.xn.sync;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class TkQuery extends TkAbstract {

	private static Logger log = LoggerFactory.getLogger(TkQuery.class.getName());
	//类ID，一定与Tree.xml配置文件中配置一绪
	public static final String taskId = "TkQuery" ;
	
	/**
	 * 执行节点任务
	 * @param node 本节点任务配置
	 * @param data 需要处理的数据
	 * @param superTasks 上级所有节点对象(不包括同级节点下子节点对象)，以备对上级节点进行回调，例如得到上级节点的处理结果
	 * @param springContext spring容器上下文对象
	 */
	@Override
	public void execute(Tree.Node node , 
			Object data, 
			Hashtable<String, Task> superTasks,
			ApplicationContext springContext) {

		//作为根任务 data为空，superTasks为空		
		superTasks = new Hashtable<String, Task>() ;
		superTasks.put(node.id, this) ;

		if(data == null){
			log.error("严重错误，上级任务传来原生数据为空！") ;
		}else{
			Map<String, Object> objs = (Map<String, Object>)data;
			if(objs.get("list") != null && objs.get("list") instanceof List){
//				List<AiThirdResourceSyncEntity> lists = (List<AiThirdResourceSyncEntity>)objs.get("list");
//				if(lists.size() > 0){
//					this.taskResult = new Object[]{lists} ;
//					this.toNextTasks(node, data, superTasks, springContext) ;
//					this.taskResult = null ;
//					System.out.println("------进入任务-----------"+lists.size()+"-------------------");
//				}
			}
		}
	}
}
