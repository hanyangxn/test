package com.xn.pojo;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/2.
 */
@Data
@Entity
@Table(name = "user")
public class User{
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String pass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name +  ", pass=" + pass + "]";
    }
}
