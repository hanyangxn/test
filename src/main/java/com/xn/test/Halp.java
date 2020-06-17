package com.xn.test;


/**
 * Created by Administrator on 2018/11/19.
 */
public class Halp {
    public Halp() {
    }

    /**
     * 实例化工作任务类
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public Hello instanceTaskObj() throws Exception {
        String clazz = "com.xn.test.Hello3";
        Class c = Class.forName(clazz);
        if (c == null) {
            throw new Exception("实例化任务对对象出错！任务类为" + clazz + "！");
        }else{
            return (Hello)c.newInstance();
        }
    }
}
