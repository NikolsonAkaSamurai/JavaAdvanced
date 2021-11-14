package com.company.task3;

import javax.xml.datatype.Duration;
import java.time.*;


public class Main {
    public static void main(String[] args) {
       LocalDateTime myBirthday = LocalDateTime.of(1995,9,12,18,0);

       calculateDate(myBirthday);

    }

    public static void calculateDate(LocalDateTime myBirthday){
        LocalDateTime realTime = LocalDateTime.now();

        int subYear = realTime.getYear() - myBirthday.getYear();
        int subMouth = realTime.getMonthValue() - myBirthday.getMonthValue();
        int subDay = realTime.getDayOfMonth() - myBirthday.getDayOfMonth();
        int subHour;

        if(realTime.getHour() - myBirthday.getHour() < 0){
            subDay--;
            subHour = myBirthday.getHour() - realTime.getHour();
        }else{
            subHour = realTime.getHour() - myBirthday.getHour();
        }

        int subMin;

        if(realTime.getMinute() - myBirthday.getMinute() < 0){
            subHour--;
            subMin = myBirthday.getMinute() - realTime.getMinute();
        }else{
            subMin = realTime.getMinute() - myBirthday.getMinute();
        }

        int subSec;

        if(realTime.getSecond() - myBirthday.getSecond() < 0){
            subMin--;
            subSec = myBirthday.getSecond() - realTime.getSecond();
        }else{
            subSec =  realTime.getSecond() - myBirthday.getSecond();
        }


        System.out.println("лет: " + subYear + " месяцев: " + subMouth + " дней: " + subDay + " часов: " + subHour +
                " минут: " + subMin + " секунд: " + subSec);

    }
}
