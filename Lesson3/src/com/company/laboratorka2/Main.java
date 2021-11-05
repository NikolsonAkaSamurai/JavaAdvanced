package com.company.laboratorka2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(System.in);
        String st1 = "com/company/laboratorka2/";
        String st2 = "com/company/laboratorka2/";
        String st3 = "com/company/laboratorka2/";

        System.out.println("впишите название первого файла");
        Scanner fileReader1 = new Scanner(st1 += scn.next());
        System.out.println("впишите название второго файла");
        Scanner fileReader2 = new Scanner(st2 += scn.next());
        System.out.println("впишите название третьего файла");
        Scanner fileReader3 = new Scanner(st3 += scn.next());

        File file1 = new File(st1);
        File file2 = new File(st2);
        File file3 = new File(st3);

        PrintWriter pw = new PrintWriter(file3);

        String line1 ="";
        while (fileReader1.hasNext()){
           line1 += fileReader1.next();
        }

        String line2 ="";
        while (fileReader1.hasNext()){
            line2 += fileReader2.next();
        }

        pw.println(line1 + line2);
        pw.close();

        System.out.println("запись в третий файл завершена");

    }
}
