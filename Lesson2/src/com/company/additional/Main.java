package com.company.additional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println("впишите новую строчку");
            String line = scn.nextLine();
            if(!line.equals(null)) list.add(line);
            if(line.equals("end")){
                exit = true;
                for(String temp:list){
                    System.out.println(temp);
                }
            };
            System.out.println("=========================");
        }
    }
}
