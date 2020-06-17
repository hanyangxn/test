package com.xn.shejimoshi;

import com.alibaba.fastjson.JSON;

/**
 * Created by Administrator on 2018/10/19.
 */
public class JianZaoZhe {
    static class Student{
        String name=null;
        int number=-1;
        String sex=null;
        int age=-1;
        String school=null;
            static class StudentBuilder{
                String name=null;
                int number=-1;
                String sex=null;
                int age=-1;
                String school=null;

                public StudentBuilder setName(String name) {
                    this.name = name;
                    return this;
                }

                public StudentBuilder setNumber(int number) {
                    this.number = number;
                    return this;
                }

                public StudentBuilder setSex(String sex) {
                    this.sex = sex;
                    return this;
                }

                public StudentBuilder setAge(int age) {
                    this.age = age;
                    return this;
                }

                public StudentBuilder setSchool(String school) {
                    this.school = school;
                    return this;
                }
                public Student build(){
                    return new Student(this);
                }
            }

        public Student(StudentBuilder builder) {
            this.name = builder.name;
            this.number = builder.number;
            this.sex = builder.sex;
            this.age = builder.age;
            this.school = builder.school;
        }
    }

    public static void main(String[] args) {
        Student a=new Student.StudentBuilder().setAge(12).setName("zhangsan").build();
        Student b = new Student.StudentBuilder().setSchool("sc").setSex("Male").setName("ZhangSan").build();
        System.out.println(a);
    }
}
