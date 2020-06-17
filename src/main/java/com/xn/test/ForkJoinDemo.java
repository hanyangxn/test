package com.xn.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinDemo {
    public static final int count=5;
    static class Fork extends RecursiveAction{

        private int start;
        private int end;

        public Fork(int start, int end) {
            this.start = start;
            this.end = end;
        }
        int i,j;
        @Override
        protected void compute() {
            if (end-start<=count){
                for (i = start; i <=end ; i++) {
                    for ( j = 2; j < i; j++) {
                        if (i%j==0){
                            break;
                        }
                    }
                    if (i==j)
                        System.out.println(i+"为质数");
                }
            }else {
                int mid=(start+end)/2;
                Fork fork=new Fork(start,mid);
                fork.fork();
                fork.join();
                Fork fork1=new Fork(start,mid);
                fork1.fork();
                fork1.join();
            }
        }
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool=new ForkJoinPool();
        forkJoinPool.invoke(new Fork(1,10000));
        forkJoinPool.shutdown();
    }
}
