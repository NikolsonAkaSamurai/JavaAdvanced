package com.company.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String word = "JAVA";
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }

        List<Character> reworkList = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            boolean dublicateChar = false;
            for (int j = 0; !dublicateChar; j++) {
                reworkList.add(list.get(i));
                dublicateChar = (j!=0 && (j%2)!=0)?true:false;
            }
        }

        for (Character temp:reworkList){
            System.out.print(temp);
        }

    }


}
