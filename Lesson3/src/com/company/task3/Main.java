package com.company.task3;

public class Main {
    public static void main(String[] args) {
        String line ="Предложение первое. Предложение второе. предложение третье";
        String line2, line3;

        String[] lines = line.split("\\.");
        line2 = line.substring(0, line.length()/2 - 1);
        line3 = line.substring(line.length()/2 -1);
        System.out.println(line2);
        System.out.println(line3);

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i].trim());
        }

    }
}
