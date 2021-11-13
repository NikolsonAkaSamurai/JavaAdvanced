package com.company.task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        //getClass
        //forName
        //суперкласс объекта Class

        Class cl = Car.class;

        Field[] fields;
        fields = cl.getDeclaredFields();
        System.out.println(cl.getName());
        System.out.println("=======");
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println(field.getName() + " " + fieldType.getName());
        }

        double spartacus = 1;

        for (int i = 0; i < 365; i++) {
            spartacus *= 1.01272;
        }

        System.out.println(spartacus);
    }




}
