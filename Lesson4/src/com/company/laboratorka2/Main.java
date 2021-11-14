package com.company.laboratorka2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String line = "aa aba abba abbba abca abea";
        Pattern p = Pattern.compile("ab*+a");
        Matcher m = p.matcher(line);


        while (m.find()){
            System.out.println(m.group());
        }

    }
}
