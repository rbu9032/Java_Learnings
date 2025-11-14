package com.java.multithreading;

public class Test {

    public static void main(String[] args){

        String name = Thread.currentThread().getName();
        System.out.println(name);
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();
        sayBye();
        //        sayHi();
    }

    static void sayHi(){
        for (int i=1; i<=5; i++){
            System.out.println("Hii");
        }
    }
    static void sayBye(){
        for (int i=1; i<=5; i++){
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Bye");
        }
    }
}
