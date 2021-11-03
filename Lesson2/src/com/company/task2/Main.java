package com.company.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("JAVA");
        System.out.println(list.toString());
        List<String> list2 = new ArrayList<>(dublicate(list));
        System.out.println(list2.toString());

    }

    public static List<String> dublicate(List<String> list){
        List<String> list2 = new ArrayList<>(list.size() * 2);
        for (int i = 0; i < list.size(); i++) {
            list2.add(i, list.get(i));
            list2.add(i+1, list.get(i));
        }
        return  list2;
    }
}
