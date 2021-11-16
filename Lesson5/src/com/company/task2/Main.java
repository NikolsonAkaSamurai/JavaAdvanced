package com.company.task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        getInfo(Cat.class);

    }

    public static void getInfo(Class cl){
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        //вывод класса
        System.out.println(s + "class: "  + s2 + cl.getName());
        //вывод полей
        Field[] fields = cl.getDeclaredFields();
        System.out.println(s + "fields:");
        for (int i = 0; i < fields.length; i++) {
            System.out.println(s + "type: " + s2 + fields[i].getType() + s + " name: " + s2 + fields[i].getName());
        }

        //вывод методов
        Method[] methods = cl.getDeclaredMethods();
        System.out.println(s + "methods:");
        for (int i = 0; i < methods.length; i++) {
            System.out.println(s + "name: " + s2 + methods[i].getName() + s +
                    " return: " + s2 + methods[i].getReturnType() + s);

            Class[] parameters = methods[i].getParameterTypes();
            for (int j = 0; j < parameters.length; j++) {
                System.out.println(s + " parameters: " + s2 + methods[j].getParameterTypes());
            }
        }

        //вывод конструкторов
        Constructor[] constructors = cl.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(s + "constructors: " + s2 + constructors[i].getName());
            Class[] parameters = constructors[i].getParameterTypes();
            for (int j = 0; j < parameters.length; j++) {
                System.out.println(s + "parameters: " + s2 + parameters[j].getName());
            }
        }

    }

}
