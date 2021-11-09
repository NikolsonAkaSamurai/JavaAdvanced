package com.company.laboratorka4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] users ={"JavaDev JavaDev@gmail.com +38(098)77-88-999",
                    "PythonMan PythonMan@yandex.ru +38(098)77 66 444",
                    "Frog Frog@mail.ru +7(965)33 55 123"};

        Pattern ptr = Pattern.compile("(^\\w{1,10})\\s" +
                                    "(\\w{0,10}@\\w{1,10}.\\w{1,3})\\s" +
                "(\\u002B\\d{1,2}\\u0028\\d{1,4}\\u0029\\d{2}[\\s\\u002D]\\d{2}[\\s\\u002D]\\d{1,5})");

        myArrayMathcer(users, ptr);

    }

    public static void myMatcher(String str, Pattern ptr){
        Matcher mtc = ptr.matcher(str);
        while (mtc.find()){
            System.out.println("Логин: " + mtc.group(1) + " почта: " + mtc.group(2) + " телефон: "+mtc.group(3));
        }
    }

    public static void myArrayMathcer(String[] strs, Pattern ptr){
        for (int i = 0; i < strs.length; i++) {
            myMatcher(strs[i],ptr);
        }
    }
}
