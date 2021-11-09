package com.company.laboratorka3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8.";

        Pattern ptr = Pattern.compile("Java\\s+\\d");
        Matcher mtc = ptr.matcher(str);

        while (mtc.find()){
            System.out.println(mtc.group());
        }
    }
}
