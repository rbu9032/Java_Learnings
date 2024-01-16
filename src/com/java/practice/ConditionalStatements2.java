package com.java.practice;

import java.util.Scanner;

public class ConditionalStatements2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        /*
         * int i =5; switch(i) { case 1:
         * System.out.println("This is the first statement"); break; case 2:
         * System.out.println("This is the second statement"); break; case 3:
         * System.out.println("This is the third statment"); break; default:
         * System.out.println("This is the default statment"); break; }
         */

        //---Assignment-1
        //System.out.println("Enter a number:");
		/*int i = sc.nextInt();
		i = i % 2;
		  switch(i) {
		  case 0:
		  System.out.println("Even number");
		  break;
		  default:
			  System.out.println("Odd number");
			  break;
		  }*/

        //---Assignment-2
		/*System.out.println("Enter first number");
		int i = sc.nextInt();
		System.out.println("Enter Second number");
		int j = sc.nextInt();
		System.out.println("Enter operation:");
		int ops = sc.nextInt();
		switch(ops) {
		case 0:
			System.out.println("Addition of two numbers:"+(i+j));
			break;
		case 1:
			System.out.println("Substraction:"+(i-j));
			break;
		case 2:
			System.out.println("Multiplication:"+(i*j));
            break;
		case 3:
			System.out.println("Division:"+(i/j));
			break;
		case 4:
			System.out.println("Modulus:"+(i%j));
			break;
			default:
				System.out.println("Inavlid");
				break;
		}*/

        //---Assignment-2 another way
		/*System.out.println("Enter first number");
		int i = sc.nextInt();
		System.out.println("Enter Second number");
		int j = sc.nextInt();
		System.out.println("Enter operation:");
		String str = sc.next();
		int result = 0;
		switch (str) {
		case "+":
			result = i+j;
			break;
		case "-":
			result = i-j;
			break;
		case "*":
			result = i*j;
			break;
		case "/":
			result = i/j;
			break;
		case "%":
			result = i%j;
			break;
		default:
			System.out.println("Invalid operation");
			break;

		}
		System.out.println(result);*/

        //---Assignment-3
        System.out.println("Enter day:");
        String dayName = sc.next();
        switch (dayName) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Uff, it's a weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Yayy, it's a weekend");
                break;
            default:
                System.err.println("Invalid day");
                break;
        }
        sc.close();

    }


}
