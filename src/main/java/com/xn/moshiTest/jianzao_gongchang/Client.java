package com.xn.moshiTest.jianzao_gongchang;

public class Client {
    /**
     * 场景类
     *
     * @param args
     */
    public static void main(String[] args) {
        // 生产一个成年超人
        AdultSuperMan adult = (AdultSuperMan)SuperManFactory.createSuperMan("adult");
        // 展示一下超人的技能
        adult.specialTalent();
        SuperMan superMan = adult.getSuperMan();
        System.out.println(superMan);

    }
}
