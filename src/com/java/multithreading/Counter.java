package com.java.multithreading;

public class Counter {

    int count = 0;

/*    public synchronized void increment(){  //synchronized method
        count++;
    }*/

    public  void increment(){
        synchronized (this){ //synchronized block
            count++;
        }
    }
}
