package com.java.multithreading;

public class DeadLock1 extends Thread{
          DeadLock2 deadLock2;
    @Override
    public void run() {
        try {
            deadLock2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i<=10; i++){
            System.out.println("From Dead Lock 1");
        }
    }
}
