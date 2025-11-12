package com.java.wrapper;

public class Test {

    public static void main(String[] args){
        int a = 10;
        Integer b = new Integer(80);
        System.out.println(a);
        System.out.println(b);

        //Autoboxing
        Integer c = Integer.valueOf(a); //this method is used before java 5
        Integer e = a;

        //Auto-unboxing
        int d = b.intValue();  //this method is used before java 5
        int f = b;

    }
}
