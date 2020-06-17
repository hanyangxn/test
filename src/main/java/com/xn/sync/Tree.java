package com.xn.sync;

public class Tree {

	public static Node root ;
	
	public class Node{
		public String id ;
		public String name ;
		public Boolean enable ;//是否执行节点的数据处理任务任务
		public String clazz ;
		public Node[] branchs ;//所有子节点
	}

}
