package com.company.laboratorka1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String line = "ahb acb aeb aeeb adcb axeb";

        Pattern p = Pattern.compile("a\\wb");
        Matcher m = p.matcher(line);

        while (m.find()){
            System.out.println(m.group());
        }

//        Scanner scn = new Scanner(line);
//
//        while (scn.hasNext()){
//            if(scn.hasNext("a\\wb")){
//                System.out.println(scn.next());
//            }else{
//                scn.next();
//            }
//        }


    }
}
