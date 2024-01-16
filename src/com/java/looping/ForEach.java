package com.java.looping;

import java.util.Arrays;

public class ForEach {

    public static void main(String[] args) {

        /*//for single dimensional array
        int arr[] = {1,2,3};
        int sum =0;
        for (int i: arr
             ) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(sum/ arr.length);
*/

        //for two-dimensional array
/*        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;
        int noOfElements = 0;
        for (int[] singleDimArray:arr
             ) {
            for (int value:singleDimArray
                 ) {
                sum += value;
                noOfElements++;
                System.out.print(value);
            }
            System.out.println();
        }
        System.out.println("Sum of all values:"+sum);
        System.out.println("Average:"+sum/noOfElements);*/


        //for jagged array
        int arr[][] = {
                {1,2,3},
                {4,5,6,4,8,2},
                {7,8,9},
                {4,9}
        };
        int sum = 0;
        int noOfElements = 0;
        for (int[] singleDimArray:arr
        ) {
            for (int value:singleDimArray
            ) {
                sum += value;
                noOfElements++;
                System.out.print(value);
            }
            System.out.println();
        }
        System.out.println("Sum of all values:"+sum);
        System.out.println("Average:"+sum/noOfElements);

    }

}
