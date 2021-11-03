package com.company.task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String city = "src/com/company/task4/Cities";
        String family = "src/com/company/task4/Familys";

        List<Node> list = new ArrayList<Node>(allData(getList(family), getList(city)));

        boolean exit = false;

        while (!exit){
            System.out.println("1) показать все города\n"+
                    "2) показать все фамилии\n"+
                    "3) начать поиск семей по названию города\n"+
                    "4) начать поиск города по фамилии семьи\n"+
                    "exit - выход из программы");
            Scanner change = new Scanner(System.in);
            switch (change.next()){
                case "1":{
                    for (Node temp:list) {
                        System.out.println(temp.getCity());
                    }
                    break;
                }
                case "2":{
                    for (Node temp:list) {
                        System.out.println(temp.getFamily());
                    }
                    break;
                }
                case "3":{
                    Scanner scn = new Scanner(System.in);
                    System.out.println("Укажите город");
                    String inqury = scn.next();
                    boolean hasInfo = false;
                    for (Node temp:list) {
                        if(temp.getCity().equals(inqury)){
                            hasInfo = true;
                            System.out.println("В городе " + inqury + " живут "+temp.getFamily());
                        }
                    }
                    if(!hasInfo) System.out.println("Город не найден");
                    break;
                }
                case "4":{
                    Scanner scn = new Scanner(System.in);
                    System.out.println("Укажите фамилию");
                    boolean hasInfo = false;
                    String inqury = scn.next();
                    for (Node temp:list) {
                        if(temp.getFamily().equals(inqury)){
                            hasInfo = true;
                            System.out.println(temp.getFamily() + " живут в городе " + temp.getCity());
                        }
                    }
                    if(!hasInfo) System.out.println("Семья не найдена");
                    break;
                }
                case "exit":{
                    exit = true;
                    break;
                }
                default:{
                    System.out.println("Неверная команда");
                }
            }
            System.out.println("===================================");
        }
    }

    public static List<String> getList(String path) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        Scanner scn = new Scanner(file);
        while (scn.hasNext()){
            list.add(scn.next());
        }
        return list;
    }

    public static List<Node> allData(List<String> cities, List<String> familys){
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < cities.size(); i++) {
            list.add(new Node(cities.get(i), familys.get(i)));
        }
        return list;
    }


}
