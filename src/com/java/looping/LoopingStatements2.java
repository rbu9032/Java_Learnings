package com.java.looping;

import java.util.Scanner;

public class LoopingStatements2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int i = sc.nextInt();
        /*for(; i<10; i++){
            System.out.println(i);
        }*/

        /*//To print a table
        for(int j = 1; j<=10; j++){
            System.out.println(i +" x " + j +" = " +i * j);
        }*/

        //Assignment to print 1 to 100 numbers
       /* System.out.println("Enter the ending number:");
        int j = sc.nextInt();
        System.out.println("Numbers from "+i+ " and "+j+" are:");
        for(; i<=j; i++){
            System.out.println(i);
        }*/

        //Assignment-2 Print even numbers between the given range
        /*System.out.println("Enter the ending number:");
        int j = sc.nextInt();
        System.out.println("Even numbers between "+i+ " and "+j+" are:");
        for(; i<j; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }*/

        //Assignment-3 Print the numbers divisible by 7 between the given range
        /*System.out.println("Enter the ending number:");
        int j = sc.nextInt();
        System.out.println("Even numbers between "+i+ " and "+j+" are:");
        for(; i<j; i++){
            if(i%7 == 0){
                System.out.println(i);
            }
        }*/

        //Assignment-4 Print the odd numbers in reverse orders from the given range
       /* System.out.println("Enter the ending number:");
        int j = sc.nextInt();
        System.out.println("Odd numbers between "+i+ " and "+j+" are:");
        for(; i>=j; i--){
            if(i%2 !=0){
                System.out.println(i);
            }
        }*/

        //Assignment-5 Print sum of even numbers from the given range
       /* System.out.println("Enter ending number:");
        int j = sc.nextInt();
        int x = i;
        int sum = 0;
        for(; i<=j; i++){
            if(i%2 == 0){
                sum +=i;
            }
            i++;
        }
        System.out.println("Sum of even numbers between "+x+" and "+j+":" +sum);*/

        //Assignment-6 Print prime numbers between the given range
        System.out.println("Enter ending number:");
        int j = sc.nextInt();
        for (; i<=j; i++){
            int noOfDividends = 0;
            boolean isPrime = true;
            if (i != 1 && 1 != 2) {
                for (int x = 1; x <= i; x++) {
                    if (i % x == 0){
                        noOfDividends++;
                    }

                }
                if(noOfDividends<=2 && noOfDividends!=0){
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
