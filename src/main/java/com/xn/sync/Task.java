package com.xn.sync;

import org.springframework.context.ApplicationContext;

import java.util.Hashtable;

/**
 * 任务接口gsh
 */
public interface Task {

    /**
     * 执行节点任务
     * @param node 本节点任务配置
     * @param data 需要处理的数据
     * @param superTasks 上级所有节点对象(不包括同级节点下子节点对象)，以备对上级节点进行回调，例如得到上级节点的处理结果
     * @param springContext spring容器上下文对象
     */
    public void execute(Tree.Node node, Object data, Hashtable<String, Task> superTasks, ApplicationContext springContext) ;

    /**
     * 得到本任务节点处理后产生的中间结果，以供下级任务节点应用上线节点的结果
     * @return
     */
    public Object[] getTaskResults() ;

    /**
     * 转下级任务节点处理，首先要实体化所有子节点。
     * @param node 本节点任务配置
     * @param data 需要处理的数据
     * @param superTasks 上级所有节点对象(不包括同级节点下子节点对象)，以备对上级节点进行回调，例如得到上级节点的处理结果
     * @param springContext spring容器上下文对象
     */
    public void toNextTasks(Tree.Node node, Object data, Hashtable<String, Task> superTasks, ApplicationContext springContext) ;


}
