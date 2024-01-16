package com.java.practice;

import java.util.Scanner;

/**
 * @author Ragahvendra Babu Ummadisetty
 * @version 1.0.0
 * @description: This class is accessing variables from outside the class by creating objects
 */
public class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Objects t1 = new Objects();
        System.out.println("Accessing variables from outside the class using object");
        System.out.println(t1.i);
        System.out.println(t1.j);
        System.out.println(t1.add());
        Objects t2 = new Objects(34, 26);
        System.out.println(t2.add());

        sc.close();
    }
}
