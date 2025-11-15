package com.java.multithreading;

public class MyThread2 extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i=1; i<=10; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

                throw new RuntimeException(e);
            }
            System.out.println("Thread 2");
        }
    }
}
