package com.java.multithreading;

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
               System.out.println("Main Thread Priority: " +Thread.currentThread().getPriority());
               WaitThread waitThread = new WaitThread(); //New Thread
               waitThread.start();  //Runnable
       // waitThread.wait(); //Blocked
        //Thread.sleep(1000); //Blocked
         synchronized (waitThread){     //locking a thread
               waitThread.wait();
            System.out.println(waitThread.count);
        }
    }
}

class WaitThread extends Thread{

    int count = 0;
    @Override
    public void run() {
        //Thread.currentThread().setName("Wait Thread");
        Thread.currentThread().setPriority(10);
        System.out.println("Wait Thread Priority: " +Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
        synchronized (this){
            for (int i = 1; i<=100; i++){
                count++;
            }
            this.notify();
        }

    }
}
