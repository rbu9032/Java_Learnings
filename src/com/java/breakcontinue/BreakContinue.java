package com.java.breakcontinue;

import java.util.Scanner;

public class BreakContinue {
    public void addition(int a, int b){
        int c = a + b;
    }
    int sumOfTwoNumbers(int a, int b){
       int sum = a + b;
       return  sum;
    }
    void division(int d){
        int div = d/2;
        System.out.println(div);
    }
    public static void main(String[] args){
        //logic to print 1 to 100 numbers and skip multiples of 8
        /*for(int i=1; i<=100; i++){
                if(i%8==0 ){
                    continue;
                }
            System.out.println(i);
        }*/
        //logic to print 1 to 100 numbers and whenever you encounter multiples of 9 exit from the loop
       /* for(int i=1; i<=100; i++){
            if(i%9==0 ){
                break;
            }
            System.out.println(i);
        }*/

        //Labels -- when we have nested loops & if we want to specify which loops it should break we can use labels. Labels are only used in for loops
       /* outer: //here the outer for loop is labeled as outer
        for(int i=1; i<=3; i++){
            inner: //here the inner for loop is labeled as outer
            for(int j=1; j<=3; j++){
                if(j==2){
                    break inner;
                }
                System.out.println("i: "+i+", j: "+j);
            }
        }*/
        //checking a number prime is not
    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int count=0;
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Given number is a prime number");
        }else{
            System.out.println("Given number is not a prime number");
        }*/

        //program to print table 5 x 1 = 5
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.println("Enter a number upto which you want to print the table for num:");
        int num1 = scanner.nextInt();
        for(int i=1; i<=num1; i++){
            System.out.println(num +" x "+i +" = " +(num * i));
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter c:");
        int c = scanner.nextInt();
        System.out.println("Enter d:");
        int d = scanner.nextInt();
        BreakContinue BC = new BreakContinue();
        BC.addition(c, d);
        int result = BC.sumOfTwoNumbers(c,d);
        System.out.println("Sum = "+ result);
       // System.out.println(result/2);
        BC.division(result);
        scanner.close();
    }
}
