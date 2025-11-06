package com.java.polymorphism.overriding;

public class Final {

    //final
    int a = 10;
    final int b = 5;
    public static void main(String[] args){
        Final obj = new Final();
        System.out.println(obj.a);
        obj.a=20;
        System.out.println(obj.a);
        System.out.println(obj.b);


    }
}
