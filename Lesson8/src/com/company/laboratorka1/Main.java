package com.company.laboratorka1;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Thread threadA = new Thread(new PrintTrhead("A.", 500));
        Thread threadB = new Thread(new PrintTrhead(".B", 500));
        Thread threadC = new Thread(new PrintTrhead("C", 500));


        threadA.start();
        threadB.start();

        if (!threadA.isAlive() && !threadB.isAlive()) threadC.start();




        System.out.println("=========");





    }
}

class PrintTrhead implements Runnable{

    private String message;
    private int time;

    public PrintTrhead(String message, int time) {
        this.message = message;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(time);
                System.out.println(message);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}