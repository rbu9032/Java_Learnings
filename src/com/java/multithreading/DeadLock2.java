package com.java.multithreading;

public class DeadLock2 extends Thread{
    DeadLock1 deadLock1;
    @Override
    public void run() {
        try {
            deadLock1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i<=10; i++){
            System.out.println("From Dead Lock 2");
        }
    }
}
