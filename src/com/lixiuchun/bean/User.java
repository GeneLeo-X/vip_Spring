package com.lixiuchun.bean;

import java.io.Serializable;

public class User implements Serializable{

    private String name;

    private Integer age;


    public void init(){
        System.out.println("初始化配置使用...");
    }

    public void destroy(){
        System.out.println("销亡方法...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
