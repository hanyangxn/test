package com.xn.test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2018/11/21.
 */
public class ShuangSeQiuTest {
    /**
     * 双色球复式组合
     * @param redBall    红球数组
     * @param blueBall   篮球数组
     * @return   产生的组合个数
     */
    public static int getDoubleChromosphere(Integer [] redBall,int [] blueBall){

        int count = 0;//产生的组合个数

        List<Integer> result = new LinkedList<Integer>();;//产生的双色球组合

        //外层循环控制篮球
        for(int i = 0;i < blueBall.length;i++){

            //控制红球
            List<Integer> redList = new LinkedList<Integer>();
            for(Integer j : redBall){
                redList.add(j);
            }
            List<Integer> orign = new LinkedList<Integer>();
            orign.addAll(redList);

            for(int k = 0;k < redList.size();k++){
                redList.remove(k);
                result = redList;

                //最后篮球的赋值
                result.add(blueBall[i]);

                //输出组合结果
                System.out.print("红球为：\t");
                for(int j = 0;j < result.size();j++){
                    if(6 == j){
                        System.out.println("篮球为：\t"+result.get(j));
                        break ;
                    }
                    System.out.print(result.get(j)+"\t");
                }
                System.out.println();

                //清空redLisr,重新赋值
                redList.clear();
                redList.addAll(orign);

                //组合数加一
                count++;
            }
        }
        return count;
    }
}
