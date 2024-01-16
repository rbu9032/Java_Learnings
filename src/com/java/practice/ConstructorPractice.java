package com.java.practice;

public class ConstructorPractice {
  public int i;
    public static void main(String[] args) {
//        ConstructorPractice cp= new ConstructorPractice();
        ConstructorPractice cp = new ConstructorPractice(43);

        System.out.println(cp.i);
    }
//    public ConstructorPractice(){
////        i = 23;
//    }

    public ConstructorPractice(int a) {

        i =a;
    }
}
