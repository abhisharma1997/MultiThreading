package com.learing.multithreading.threads;

public class SecondThread  extends Thread {
    public void run(){
        //Task for SecondThread with Sleep of 2 sec

        //Printing Hello World 5 times

        for (int i = 0; i < 5; i++) {
            System.out.println("From Second Thread : "+i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }
}
