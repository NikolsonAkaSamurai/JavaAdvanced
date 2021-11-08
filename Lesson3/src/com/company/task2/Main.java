package com.company.task2;

import java.io.*;

public class Main {

    public static void main(String[] args){
        File file = new File("C:\\Users\\николай\\Desktop\\материалы уроков\\JavaAdvaced\\JavaAdvanced\\Lesson3\\src\\com\\company\\task2\\text.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file)) ;
            bw.write("Hello world!");
            bw.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
