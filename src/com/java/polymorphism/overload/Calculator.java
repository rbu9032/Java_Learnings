package com.java.polymorphism.overload;

public class Calculator {
    public static void main(String[] args){
        int total = Calculator.sum();
        System.out.println(total);
        total = Calculator.sum(5,8);
        System.out.println(total);
        Calculator.sum(5,3,4);
    }

    static int sum(){
        int a = 10 + 20;
        return a;
    }

    static int sum(int a, int b){
        int c = a + b;
        return c;
    }

    static void sum(int x, int y, int z){
        int u = x + y + z;
        System.out.println(u);
    }
}
