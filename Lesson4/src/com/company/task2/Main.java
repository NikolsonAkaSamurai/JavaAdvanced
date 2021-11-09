package com.company.task2;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        File text = new File("C:\\Users\\николай\\Desktop\\материалы уроков\\JavaAdvaced\\JavaAdvanced\\Lesson4\\src\\com\\company\\task2\\text.txt");

        FileReader fr = new FileReader(text);
        BufferedReader br = new BufferedReader(fr);
        String temp;

        Pattern ptr = Pattern.compile("[а-я[А-Я]]{1,3}");
        while ((temp = br.readLine()) != null){
            temp = myScanner(temp, ptr);
            System.out.println(temp);
        }

    }

    public static String myScanner(String str, Pattern ptr){
        Scanner scn = new Scanner(str);
        String temp ="";
        String[] array = str.split("\\s");
        Matcher mtc;

        for (int i = 0; i < array.length; i++) {
            mtc = ptr.matcher(array[i]);
            temp += (mtc.matches())? " Java " : " " + array[i];
        }
        return temp;
    }
}
