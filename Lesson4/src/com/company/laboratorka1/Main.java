package com.company.laboratorka1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String line = "ahb acb aeb aeeb adcb axeb";

        Pattern p = Pattern.compile("(a.b)\\s(a.b)\\s(a.b)");
        Matcher m = p.matcher(line);

        m.find();

        for (int i = 0; i < m.groupCount(); i++) {
            System.out.println(m.group(i));
        }


    }
}
