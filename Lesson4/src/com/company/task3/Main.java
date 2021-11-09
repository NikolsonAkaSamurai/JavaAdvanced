package com.company.task3;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime other = LocalDateTime.of(2020,10,8,16,2,40);

        long foolTime = ChronoUnit.SECONDS.between(other, LocalDateTime.now());
        long years = ChronoUnit.YEARS.between(other, LocalDateTime.now());
        foolTime -= years*31536000;
        long moths = ChronoUnit.MONTHS.foo;
//        int year = (int) (seconds - (seconds%31536000))/31536000;
//        int mouth = (int) ((seconds - year * 31536000) - (seconds - year * 31536000)%2592000);
        System.out.println(moths);
    }
}
