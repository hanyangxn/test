package com.xn.util;

/**
 * Created by Administrator on 2018/1/30.
 */
public class User1 {
    private String da;
    private String er;
    private String san;
    private String si;

    public User1(String da, String er, String san, String si) {
        this.da = da;
        this.er = er;
        this.san = san;
        this.si = si;
    }

    public User1() {
    }

    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }

    public String getEr() {
        return er;
    }

    public void setEr(String er) {
        this.er = er;
    }

    public String getSan() {
        return san;
    }

    public void setSan(String san) {
        this.san = san;
    }

    public String getSi() {
        return si;
    }

    public void setSi(String si) {
        this.si = si;
    }

    @Override
    public String toString() {
        return "User1{" +
                "da='" + da + '\'' +
                ", er='" + er + '\'' +
                ", san='" + san + '\'' +
                ", si='" + si + '\'' +
                '}';
    }
}
