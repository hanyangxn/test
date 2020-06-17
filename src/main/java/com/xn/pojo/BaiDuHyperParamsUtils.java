package com.xn.pojo;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/16.
 */
public class BaiDuHyperParamsUtils extends BaiDuQaAnswerEntity.QaAnswerUtil implements Serializable{
    private BaiQaHyperParams hyper_params;

    public BaiQaHyperParams getHyper_params() {
        return hyper_params;
    }

    public void setHyper_params(BaiQaHyperParams hyper_params) {
        this.hyper_params = hyper_params;
    }

    @Override
    public String toString() {
        return "BaiDuHyperParamsUtils{" +
                "hyper_params=" + hyper_params +
                '}';
    }
}
