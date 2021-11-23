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
            System.out.println(myInterface.isEven(num));

        }

    }



}
@FunctionalInterface
interface MyInterface{
    boolean isEven(int a);
}