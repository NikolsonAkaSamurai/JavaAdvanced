package com.company.task3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> linked = new LinkedList<>(getIntegerList());
        System.out.println("минимальное число в списке: "+getMinimum(linked));

    }

    public static Integer inputInteger(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        return (Integer) scn.nextInt();
    }

    public static List<Integer> getIntegerList(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Количество чисел?");
        int size = scn.nextInt();
        List<Integer> linked = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linked.add(inputInteger());
        }
        return linked;
    }

    public static Integer getMinimum(List<Integer> list){
        int a = list.get(0);
        for (Integer temp:list) {
            if(temp<a) a = temp;
        }
        return (Integer)a;
    }
}
