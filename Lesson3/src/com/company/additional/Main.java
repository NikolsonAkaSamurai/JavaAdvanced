package com.company.additional;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\николай\\Desktop\\материалы уроков\\JavaAdvaced\\JavaAdvanced\\Lesson3\\src\\com\\company\\additional\\text.txt");
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file)
                    )
            );
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
