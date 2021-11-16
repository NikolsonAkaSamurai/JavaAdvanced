package com.company.test;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\николай\\Desktop\\материалы уроков\\JavaAdvaced\\JavaAdvanced\\Lesson7\\src\\com\\company\\test\\file.txt");

        Car car = new Car(200, "bmw");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){

            oos.writeObject(car);

            Car car2 = (Car) ois.readObject();

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
