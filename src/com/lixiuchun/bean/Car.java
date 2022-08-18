package com.lixiuchun.bean;

import java.io.Serializable;

public class Car implements Serializable{

    private Double price;

    private String color;

    private String name;

    public Car() { }

    public Car(Double price, String color) {
        System.out.println("Car(Double price, String color)");
        this.price = price;
        this.color = color;
    }

    public Car(Double price, Integer color) {
        System.out.println("Car(Double price, Integer color)");
        this.price = price;
        this.color = color + "";
    }

    public Car(String color , Double price) {
        System.out.println("Car(String color ,Double price)");
        this.price = price;
        this.color = color;
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
