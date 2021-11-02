package com.company.laboratorka2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserList userList = new UserList();
        boolean exit = false;
        Scanner scn = new Scanner(System.in);


        while (!exit){
            System.out.println("1) добавить нового пользователя\n"+
                    "2) удалить пользователя по логину\n"+
                    "3) найти пользователя по логину\n"+
                    "4) Изменить логин существующего пользователя\n"+
                    "5) изменить пароль существующего пользователя\n"+
                    "6) посмотреть весь список пользователей\n"+
                    "exit выход");
            switch (scn.next()){
                case "1":{
                    userList.consoleAddUser();
                    break;
                }
                case "2":{
                    userList.consoleRemoveUser();
                    break;
                }
                case "3":{
                    userList.consoleContainsUser();
                    break;
                }
                case "4":{
                    userList.consoleRewriteLogin();
                    break;
                }
                case "5":{
                    userList.consoleRewritePass();
                    break;
                }
                case "6":{
                    System.out.println(userList.toString());
                    break;
                }
                case "exit":{
                    exit = true;
                    break;
                }
                default:{
                    System.out.println("Такой операции нету");
                    break;
                }
            }
            System.out.println("=========================================");
        }
    }

}
