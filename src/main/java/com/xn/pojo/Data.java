package com.xn.pojo;

/**
 * Created by Administrator on 2018/10/9.
 */
public class Data {
    private String id;
    private String name;

    public Data(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
