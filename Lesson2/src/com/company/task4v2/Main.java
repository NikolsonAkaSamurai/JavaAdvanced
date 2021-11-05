package com.company.task4v2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        Map<String,String> getFamily = new HashMap<>();
        loadToMap(getFamily);

        boolean exit = false;

        while (!exit){
            System.out.println("1) найти семью по городу\n"+
                    "2) показать все города\n"+
                    "exit - выход");
            String operation = new Scanner(System.in).next();
            switch (operation){
                case "1":{
                    System.out.println("впишите город");
                    System.out.println(getFamily.get(new Scanner(System.in).next()));
                    break;
                }
                case "2":{
                    for (String city:getFamily.keySet()){
                        System.out.println(city);
                    }
                    break;
                }
                case "exit":{
                    exit = true;
                    break;
                }
                default:{
                    System.out.println("такой команды нету");
                }
            }
            System.out.println("==============================");
        }
    }

    public static void loadToMap(Map<String, String> map) throws FileNotFoundException {
        Scanner scnCities = new Scanner(new File("src/com/company/task4v2/Cities"));
        Scanner scnFamilys = new Scanner(new File("src/com/company/task4v2/Familys"));
        while (scnCities.hasNext() && scnFamilys.hasNext()){
            map.put(scnCities.next(),scnFamilys.next());
        }
    }
}
