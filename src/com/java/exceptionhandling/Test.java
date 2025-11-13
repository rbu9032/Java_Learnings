package com.java.exceptionhandling;

import java.util.Scanner;

public class Test {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        try{
           System.out.println("Enter age: ");
           int age = sc.nextInt();
           if(age>18){
               System.out.println("You can vote");
           }else {
               throw new InvalidAgeException("You are not eligible");
           }
       // }catch (Exception e){
           // System.out.println(e);
        //}
        }catch (InvalidAgeException e){
             System.out.println(e);
            }
        System.out.println("Byeee");
    }
}
