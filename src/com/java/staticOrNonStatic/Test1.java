package com.java.staticOrNonStatic;

import com.java.temp.Test;

import java.util.Random;

public class Test1 {

    //int number;
    static int number;
    public static void main(String[] args) {
       /* Test1 t1 = new Test1();
        t1.number = new Random().nextInt();

        Test1 t2 = new Test1();
        t2.number = new Random().nextInt();

        Test1 t3 = new Test1();
        t3.number = new Random().nextInt();


        System.out.println(t1.number);
        System.out.println(t2.number);
        System.out.println(t3.number);*/
        Test1.number = new Random().nextInt();
        Test1.number = new Random().nextInt();
        Test1.number = new Random().nextInt();
        System.out.println(Test1.number);
        System.out.println(Test1.number);
        System.out.println(Test1.number);
    }
    public static void print(){
        System.out.println("static method");
    }
}
