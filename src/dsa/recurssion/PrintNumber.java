package dsa.recurssion;

import java.util.Scanner;

public class PrintNumber {

    //Write a function to print 5 numbers and user will give a number
    //user --> n=1, o/p --> 1,2,3,4,5
    public static void main(String[] args) {
        print1(1);
    }
    public static void print1(int n){
        System.out.println(n);
        print2(n+1);
    }

    private static void print2(int n) {
        System.out.println(n);
        print3(n+1);
    }
    private static void print3(int n) {
        System.out.println(n);
        print4(n+1);
    }
    private static void print4(int n) {
        System.out.println(n);
        print5(n+1);
    }
    private static void print5(int n) {
        System.out.println(n);
    }
}
