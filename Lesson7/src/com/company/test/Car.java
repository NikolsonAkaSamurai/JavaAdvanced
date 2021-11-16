package com.company.test;

import java.io.Serializable;

public class Car implements Serializable {

    private int price;
    private String model;

    public Car(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
