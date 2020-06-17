package com.xn.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/10/16.
 */
public class BaiQaHyperParams implements Serializable{
    private String slu_level;
    private String slu_threhold;
    private List<String> slu_tags;

    public String getSlu_level() {
        return slu_level;
    }

    public void setSlu_level(String slu_level) {
        this.slu_level = slu_level;
    }

    public String getSlu_threhold() {
        return slu_threhold;
    }

    public void setSlu_threhold(String slu_threhold) {
        this.slu_threhold = slu_threhold;
    }

    public List<String> getSlu_tags() {
        return slu_tags;
    }

    public void setSlu_tags(List<String> slu_tags) {
        this.slu_tags = slu_tags;
    }

    @Override
    public String toString() {
        return "BaiQaHyperParams{" +
                "slu_level='" + slu_level + '\'' +
                ", slu_threhold='" + slu_threhold + '\'' +
                ", slu_tags=" + slu_tags +
                '}';
    }
}
