package com.learing.multithreading.threads;

public class FirstThread implements Runnable{

    public void run(){
        //Task for Thread
        //Print 1-10 numbers

        for(int i = 0 ; i <= 10 ; i++ ){
            System.out.println("From First Thread : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
