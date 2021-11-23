package com.company.laboratorka1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(14);


        MyInterface myInterface = (a) -> a % 2 == 0;
        for (Integer num: nums){
            System.out.println("число " + num + " четное? " + myInterface.myMethod(num));
        }

        System.out.println("================");
        MyInterface myInterface1 = a -> a % 2.0 != 0;
        for (Integer num: nums){
            System.out.println("число " + num + " нечетное? " + myInterface1.myMethod(num));
        }

        System.out.println("================");
        MyInterface myInterface2 = a -> a >= 3 && a < 14;
        for(Integer num: nums){
            System.out.println("число " + num + " входит  диапазон? " + myInterface2.myMethod(num));
        }

        System.out.println("================");
        MyInterface myInterface3 = a -> a % 3 == 0;
        for(Integer num: nums){
            System.out.println("число " + num + " кратно 3? "  + myInterface3.myMethod(num));
        }

    }



}
@FunctionalInterface
interface MyInterface{
    boolean myMethod(int a);
}