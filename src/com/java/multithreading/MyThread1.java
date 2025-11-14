package com.java.multithreading;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        Thread.currentThread().setName("My Thread");
        String name = Thread.currentThread().getName();
        System.out.println("---------" +name);
        for (int i=1; i<=10; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1");
        }
    }
}
