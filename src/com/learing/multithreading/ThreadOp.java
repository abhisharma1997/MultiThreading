package com.learing.multithreading;

import com.learing.multithreading.threads.FirstThread;
import com.learing.multithreading.threads.SecondThread;

public class ThreadOp {

    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        Thread t = new Thread(ft);
        SecondThread st = new SecondThread();
        t.setName("FirstThread");
        t.setPriority(1);
        st.setPriority(2);
        t.start();
        st.start();

        System.out.println(t.getName());



        st.setName("SecondThread");

        System.out.println(st.getName());

        /*
            Like wise we have several methods we can use for thread
            -> getName()
            -> setName(String name)
            -> run()
            -> start()
            -> getId()
            -> setPriority(p)
            -> getPriority()
            -> sleep() , join() , interrupt() , resume() , stop() etc
            -> currentThread()

         */
    }

}
