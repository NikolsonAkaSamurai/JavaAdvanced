package com.company.task2;

public class Cat {
    private String name;
    private int age;

    public Cat(){

    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say(){
        System.out.println("meow");
    }
}
