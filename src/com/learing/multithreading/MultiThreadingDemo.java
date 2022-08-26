package com.learing.multithreading;

import com.learing.multithreading.threads.FirstThread;
import com.learing.multithreading.threads.SecondThread;

public class MultiThreadingDemo{
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        Thread t = new Thread(ft);

        SecondThread st = new SecondThread();

        t.start();
        st.start();
    }
}
