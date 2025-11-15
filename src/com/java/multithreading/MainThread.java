package com.java.multithreading;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
          Thread1 thread1 = new Thread1(counter);
          Thread2 thread2 = new Thread2(counter);
          thread1.start();
          thread2.start();
          thread1.join();      //join() method will stop the execution of the main thread. For example, I'm calling the join method with thread1 object, that means stop execution of main thread until the thread1 is completed
          thread2.join();
          //Thread.sleep(500);
          System.out.println("Counter value: " +counter.count);
    }

}
class Thread1 extends Thread{

    Counter counter;

    public Thread1(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for(int i = 1; i<=10000; i++){
            counter.increment();
        }
    }
}

class Thread2 extends Thread{
    Counter counter;
    public Thread2(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for(int i = 1; i<=10000; i++){
            counter.increment();
        }
    }
}
