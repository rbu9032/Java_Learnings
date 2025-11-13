package com.java.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        int num3 = 0;

            num3 = num1 / num2;
            System.out.println("After division: " +num3);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println(e);
            //System.out.println("Divided by zero is not possible");
        }
     /*   catch (InputMismatchException e){
            System.out.println(e);
        }*/
        finally {
            System.out.println("Entered finally");
            sc.close();
        }

        System.out.println("Bye");
    }
}
