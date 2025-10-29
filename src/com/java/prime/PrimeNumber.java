package com.java.prime;

import java.util.Scanner;


public class PrimeNumber {

    void checkinPrime(long num){
        long casestart1 = System.currentTimeMillis();
        int count=0;
        for(long i=1; i<=num; i++){
            if(num % i == 0){
                count++;
            }
        }
        long caseend1 = System.currentTimeMillis();
        if(count == 2){
            System.out.println("Prime number case1: Given number is a prime number");
        }else{
            System.out.println("Prime number case1: Given number is not a prime number");
        }
        System.out.println("Time taken for case 1: " + (caseend1 - casestart1));
    }
    void checkinPrime2(long num){
        long casestart2 = System.currentTimeMillis();
        int count=0;
        for(long i=2; i<=num; i++){
            if(num % i == 0){
                count++;
            }
        }
        long caseend2 = System.currentTimeMillis();
        if(count == 1){
            System.out.println("Prime number case2: Given number is a prime number");
        }else{
            System.out.println("Prime number case2: Given number is not a prime number");
        }
        System.out.println("Time taken for case 2: " +(caseend2 - casestart2));
    }
    void checkinPrime3(long num){
        long casestart3 = System.currentTimeMillis();
        int count=0;
        for(long i=2; i<=num-1; i++){
            if(num % i == 0){
                count++;
            }
        }
        long caseend3 = System.currentTimeMillis();
        if(count == 0){
            System.out.println("Prime number case3: Given number is a prime number");
        }else{
            System.out.println("Prime number case3: Given number is not a prime number");
        }
        System.out.println("Time taken for case 3: " +(caseend3 - casestart3));
    }
    void checkinPrime4(long num){
        long casestart4 = System.currentTimeMillis();
        int count=0;
        for(long i=2; i<=num/2; i++){
            if(num % i == 0){
                count++;
            }
        }
        long caseend4 = System.currentTimeMillis();
        if(count == 0){
            System.out.println("Prime number case4: Given number is a prime number");
        }else{
            System.out.println("Prime number case4: Given number is not a prime number");
        }
        System.out.println("Time taken for case 4: " +(caseend4 - casestart4));
    }
    void checkinPrime5(long num){
        long casestart5 = System.currentTimeMillis();
        int count=0;
        for(long i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                count++;
            }
        }
        long caseend5 = System.currentTimeMillis();
        if(count == 0){
            System.out.println("Prime number case5: Given number is a prime number");
        }else{
            System.out.println("Prime number case5: Given number is not a prime number");
        }
        System.out.println("Time taken for case 5: " +(caseend5 - casestart5));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = scanner.nextInt();
        long num = 99999999L;
        PrimeNumber pm = new PrimeNumber();
        pm.checkinPrime(num);
        pm.checkinPrime2(num);
        pm.checkinPrime3(num);
        pm.checkinPrime4(num);
        pm.checkinPrime5(num);
        scanner.close();

    }
}

