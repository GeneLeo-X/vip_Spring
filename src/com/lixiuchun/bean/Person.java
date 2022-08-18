package com.lixiuchun.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Person implements Serializable {

    private String name;
    private Integer age;

    private Integer height;

    private Car car;

    public Person(){
        //System.out.println("默认构造器");
    }

    public Person(String name){
        this.name = name;
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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", car=" + car +
                '}';
    }
}
