package com.java.multithreading;

public class DeadLockMain extends  Thread{

  public static void main(String[] args){
      DeadLock1 deadLock1 = new DeadLock1();
      DeadLock2 deadLock2 = new DeadLock2();

      deadLock1.deadLock2 = deadLock2;
      deadLock2.deadLock1 = deadLock1;
      deadLock1.start();
      deadLock2.start();
      System.out.println("Main Thread");
  }
}
