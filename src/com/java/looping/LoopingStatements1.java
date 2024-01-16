package com.java.looping;

import java.util.Scanner;

public class LoopingStatements1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int i = 0;
        /*while(i<4){
            System.out.println(i);
            i++;
        }*/

       /* do{
            System.out.println(i);
            i++;
        }while (i<0);*/

        //Assignment-1  ---Print 1 to 100 numbers
        /*System.out.println("Enter a number:");
        int i=sc.nextInt();
        System.out.println("Condition is satisfied:");
        while(i<=100){
            System.out.println(i);
            i++;
        }*/
        /*//other way of doing assignment-1
        System.out.println("Enter starting  number:");
        int  startingNumber = sc.nextInt();
        System.out.println("Enter ending number:");
        int endingNumber  = sc.nextInt();
        int number = startingNumber;
        System.out.println("Condition is satisfied:");
        while(number<=endingNumber){
            System.out.println(number);
            number++;
        }*/
        //Assignment-2 ---Print even numbers between 200 and 500
       /* System.out.println("Enter a number:");
        int i = sc.nextInt();
        System.out.println("Even number between 200 and 500 are:");
        while (i >= 200 && i <= 500) {
            int x = i % 2;
            if (x == 0) {
                System.out.println(i);
            }
            i++;
        }*/
        //other way of doing assignment-2
     /*   System.out.println("Enter starting  number:");
        int  startingNumber = sc.nextInt();
        System.out.println("Enter ending number:");
        int endingNumber  = sc.nextInt();
        int number = startingNumber;
        System.out.printf("Even number between %d and %d are:\n",startingNumber, endingNumber);
        while(number<=endingNumber){
            if(number%2 == 0){
                System.out.println(number);
            }
            number++;
        }*/

        //Assignment-3  ---Print number divisible by 7 within 150 and 200
     /*   System.out.println("Enter starting  number:");
        int  startingNumber = sc.nextInt();
        System.out.println("Enter ending number:");
        int endingNumber  = sc.nextInt();
        int number = startingNumber;
        System.out.printf("Even number between %d and %d are:\n",startingNumber, endingNumber);
        while(number<=endingNumber){
            if(number%7 == 0){
                System.out.println(number);
            }
            number++;
        }*/

        //Assignment-4 ---Print prime numbers between 50 and 150
        System.out.println("Enter starting  number:");
        int  startingNumber = sc.nextInt();
        System.out.println("Enter ending number:");
        int endingNumber  = sc.nextInt();
        int  number = startingNumber;
        while(number<=endingNumber){
            boolean isPrime = true;
            // Check if the number is neither 1 nor 2
            if(number !=1 && number !=2){
                int i = 2;
                // Check for factors from 2 to (number-1)
                while (i < number) {
                    if (number % i == 0) {
                        // If a factor is found, the number is not prime
                        isPrime = false;
                        break;
                    }
                    i++;
                }

            }else {
                // 1 and 2 are not prime numbers
                isPrime = false;
            }
            // If isPrime is still true, then the number is prime
            if(isPrime){
                System.out.println(number);
            }

          number++;
        }



        //Assignment-5  --Print the sum of even numbers between 40 and 80
       /* System.out.println("Enter starting  number:");
        int  startingNumber = sc.nextInt();
        System.out.println("Enter ending number:");
        int endingNumber  = sc.nextInt();
        int number = startingNumber;
        int i = startingNumber;
        int sum = 0;
        //System.out.printf("Even number between %d and %d are:\n",startingNumber, endingNumber);
        while(number<=endingNumber){
            if(number%2 == 0){
                sum += number;
            }
            number++;
        }
        System.out.println("Sum of even numbers between "+i+" and "+endingNumber+" is:" +sum);
*/
        //Assignment-6 --Print the odd numbers between 200 and 25
     /*   System.out.println("Enter starting  number:");
        int  startingNumber = sc.nextInt();
        System.out.println("Enter ending number:");
        int endingNumber  = sc.nextInt();
        int number = startingNumber;
        System.out.printf("Even number between %d and %d are:\n",startingNumber, endingNumber);
        while(number>=endingNumber){

            if(number%2== 1){
                System.out.println(number);
            }
            number--;
        }*/

        sc.close();
    }
}
