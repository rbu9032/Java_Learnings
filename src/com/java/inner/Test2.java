package com.java.inner;

public class Test2 {

    public static void main(String[] args) {
       /* Thread1 thread1 = new Thread1();
        thread1.start();
        Runnable thread2 = new Thread2();
        Thread thread = new Thread(thread2);
        thread.start();*/
        Runnable thread3 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("From thread3");
            }
        };
        Thread th3 = new Thread(thread3);
        th3.start();

        Runnable th = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Thread created using lambda expression");};
        Thread t = new Thread(th);
        t.start();

        Thread thr = new Thread(()->{System.out.println(Thread.currentThread().getName());
            System.out.println("Thread created using lambda expression without runnable");});
        thr.start();
    }


}
/*
class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("From Thread1");
    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("From Thread2");
    }
}*/
