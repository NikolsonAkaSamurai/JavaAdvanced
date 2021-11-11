package com.company.laboratorka1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    private static int clModifiers;

    public static void main(String[] args) {

        Class cl = Cat.class;




        Field[] fields;

        fields = cl.getDeclaredFields();
        System.out.println(cl.getName());
        System.out.println("=======");
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println(field.getName());
            System.out.println(fieldType.getName());
        }
        System.out.println("=======");

        Method[] methods = cl.getMethods();

        for (Method temp:methods){
            System.out.println(temp.getName());
        }



    }
}
