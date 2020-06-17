package com.xn.sync;

public class Help {


	public Help(){
		
	}
	
	/**
	 * 实例化工作任务类
	 * @param node
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public Task instanceTaskObj(Tree.Node node) throws Exception {
		String clazz = node.clazz ;
		Class c = Class.forName(clazz);
		if (c == null) {
			throw new Exception("实例化任务对对象出错！任务类为" + clazz + "！");
		}else{
			return (Task)c.newInstance();
		}
	}
}
