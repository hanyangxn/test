package com.xn.moshiTest.jianzao_gongchang;

public abstract class Builder {
    // 定义一个超人的应用
    protected final SuperMan superMan = new SuperMan();

    /**
     * 构造出超人躯体
     *
     * @param body
     */
    public void setBody(String body) {
        this.superMan.setBody(body);
    }

    /**
     * 构建出超人的特殊技能
     *
     * @param st
     */
    public void setSpecialTalent(String st) {
        this.superMan.setSpecialTalent(st);
    }

    /**
     * 购机拿出超人的特殊标记
     *
     * @param ss
     */
    public void setSpecialSymbol(String ss) {
        this.superMan.setSpecialSymbol(ss);
    }

    /**
     * 构建出一个完整的超人
     *
     * @return
     */
    public abstract SuperMan getSuperMan();

    /**
     *机器人体魄
     *
     * @return
     */
    public abstract void specialTalent();
}
