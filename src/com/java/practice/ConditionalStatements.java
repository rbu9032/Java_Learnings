package com.java.practice;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        /*
         * String examStatus = "Pass";
         * if(examStatus == "Pass") {
         *  System.out.println("You have cleared online assessment wait for Technical Round");
         * String technicalRound = "Pass";
         *  if(technicalRound == "Pass") {
         *  System.out.println("Congratulations! You have cleared Technical Round, we will update about the next process");
         *  String hrRound = "Fail";
         *   if(hrRound=="Pass") {
         *  System.out.println("We are happy to share that you have cleared all steps needed to be part of our organization");
         *  }else {
         * System.out.println("Unfortunately we cannot proceed with your candidature");
         * }
         * }
         *
         * }else {
         * System.out.println("Unfortunately we cannot proceed with your candidature");
         * }
         */

        //Assignment-1

        System.out.println("Enter a number:");
        int i=sc.nextInt();
        if(i%2 == 0) {
            System.out.println("The given number is even number");
        }else {
            System.out.println("The given number is odd number"); }

        //Assignment-2

        /*System.out.println("Enter marks of the student:");
         * int i = sc.nextInt();
         *  if(i==35) {
         *  System.out.println("Pass");
         *   } else if(i>35 && i<=70) {
         *  System.out.println("Third class");
         *  }else if(i>70 && i<=85) {
         * System.out.println("Second class");
         * }else if(i>85) {
         * System.out.println("First class");
         *  }else {
         *   System.out.println("Fail");
         *   }
         */  // nestedif solution for the assignment-2
		/*System.out.println("Enter marks");
		int i = sc.nextInt();
		if(i>=35) {
			System.out.println("Pass");
			if(i>35 && i<=70) {
				System.out.println("Third Class");
			}if(i>70 && i<=85) {
				System.out.println("Second Class");
		}if(i>85) {
			 System.out.println("First class");
		}
		}else {
			System.out.println("Fail");
		}*/



        //Assignment-3
		/*System.out.println("Enter day:");
		String day=sc.nextLine();
		if(day.equals("Monday")|| day.equals("Tuesday")|| day.equals("Wednesday")|| day.equals("Thursday")|| day.equals("Friday")) {
			System.out.println("Uff, it's a weekday");
		}*/ /*
         * else if(day == "Tuesday") { System.out.println("Uff, it's a weekday"); }else
         * if(day == "Wednesday"){ System.out.println("Uff, it's a weekday"); }else
         * if(day == "Thursday") { System.out.println("Uff, it's a weekday"); }else
         * if(day == "Friday") { System.out.println("Uff, it's a weekday"); }
         */  /*else if (day.equals("Saturday") || day.equals("Sunday") ) {
			System.out.println("Yayy, it's a weekend");
		}else {
			System.out.println("Invalid input");
		}*/

        sc.close();
    }
}
