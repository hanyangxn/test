package com.xn.util;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Queue {
    private boolean requestType = false;

    public boolean isRequestType() {
        return requestType;
    }

    public void setRequestType(boolean requestType) {
        this.requestType = requestType;
    }

    public static void main(String[] args) {
//        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue();
//        queue.offer("你好");
//        queue.offer("haha");
//       while (!queue.isEmpty()){
//           System.out.println(queue.poll());
//       }
        Queue queue=new Queue();
        System.out.println(queue.isRequestType());
    }
}
