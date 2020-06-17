package com.xn.shejimoshi;

/**
 * Created by Administrator on 2018/10/19.
 */
public class DanLi {
    private final static DanLi danLi=new DanLi();

    private DanLi() {
    }

    public static DanLi getDanLi() {
        return danLi;
    }
}
