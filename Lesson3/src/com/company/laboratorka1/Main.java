package com.company.laboratorka1;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(System.in);
        System.out.println("впишите название файла (file)");
        String begin = "src/com/company/laboratorka1/";
        String path = begin += scn.next();

        File file = new File(path);
        Scanner readFile = new Scanner(file);

        while (readFile.hasNext()){
            System.out.println(readFile.next());
        }
        System.out.println("файл прочитан!");
    }
}
