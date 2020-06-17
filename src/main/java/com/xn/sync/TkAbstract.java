package com.xn.sync;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import java.util.Hashtable;

public abstract class TkAbstract implements Task {

	private static Logger log = LoggerFactory.getLogger(TkAbstract.class.getName());
	protected Object[] taskResult ;

	/**
	 * 得到本任务节点处理后产生的中间结果，以供下级任务节点回调应用
	 * @return
	 */
	@Override
	public Object[] getTaskResults(){
		return taskResult ;
	}

	/**
	 * 转下级任务节点处理，首先要实例化所有子节点。
	 * @param node 本节点任务配置
	 * @param data 需要处理的数据
	 * @param superTasks 上级所有节点对象(不包括同级节点下子节点对象)，以备对上级节点进行回调，例如得到上级节点的处理结果
	 * @param springContext spring容器上下文对象
	 */
	@Override
	public void toNextTasks(Tree.Node node ,
			Object data, 
			Hashtable<String, Task> superTasks,
			ApplicationContext springContext) {
		try {
			if(node != null && node.branchs != null){
				for(int i = 0 ; i < node.branchs.length ; i++){
					if(node.branchs[i].enable){
						Task t = new Help().instanceTaskObj(node.branchs[i]);
						t.execute(node.branchs[i], data, superTasks, springContext) ;
					}else{
						//本节点不起作用，直接进入本节的子节点
						this.toNextTasks(node.branchs[i], data, superTasks, springContext) ;
					}
				}
			}
		} catch (Exception e) {
			log.error("向下级任务传递工作时出错，" , e);
		}finally{
		}
	}

}
