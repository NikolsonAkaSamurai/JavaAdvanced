package com.company.additional;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Pattern patternLogin = Pattern.compile("[a-zA-Z]+");
        Pattern patternPassword = Pattern.compile("([\\d]||[\\W])+");


        boolean exit = false;

        while (!exit){
            System.out.println((char) 27 + "[34m" + "Введите логин латинскими буквами");
            String login = scn.next();
            Matcher matcherLogin = patternLogin.matcher(login);
            exit = (matcherLogin.matches() == true)?true:false;
            if(exit) break;
            System.out.println((char) 27 + "[31m" + "Не корректный логин!");
        }

        System.out.println((char) 27 + "[32m" + "Логин введен успешно!");
        exit = false;

        while (!exit){
            System.out.println((char) 27 + "[34m" + "Введите пароль из цифр и символов");
            String password = scn.next();
            Matcher matcherPassword = patternPassword.matcher(password);
            exit = (matcherPassword.matches() == true)?true:false;
            if(exit) break;

            System.out.println((char) 27  + "[31m" + "Не корректный пароль!");

        }
        System.out.println((char) 27 + "[32m" + "Регистрация прошла успешно");
    }
}
