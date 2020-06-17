package com.xn.moshiTest.jianzao_gongchang;

public class ChildSuperMan extends Builder implements ISuperMan {

    @Override
    public void specialTalent() {
        System.out.println("小超人的能力是刀枪不入、快速运动");
    }

    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的躯体");
        super.setSpecialTalent("刀枪不入");
        super.setSpecialSymbol("胸前带小S标记");
        return super.superMan;
    }
}