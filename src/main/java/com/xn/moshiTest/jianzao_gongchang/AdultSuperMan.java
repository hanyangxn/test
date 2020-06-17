package com.xn.moshiTest.jianzao_gongchang;


public class AdultSuperMan extends Builder implements ISuperMan {

    @Override
    public void specialTalent() {
        System.out.println("超人力大无穷");
    }

    @Override
    public SuperMan getSuperMan() {
        superMan.setBody("强壮的躯体");
        superMan.setSpecialTalent("会飞行");
        superMan.setSpecialSymbol("胸前带S标记");
        return superMan;
    }
}