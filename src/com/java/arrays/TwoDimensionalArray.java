package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating two-dimensional array
        /*int[][] arr = new int[3][2];

        //initializing values in array
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[2][0] = 5;
        arr[2][1] = 6;*/

        //Another approach to create and initialize an 2-d array
        //int arr[][] = {{1,2},{3,4},{5,6}};  /*second approach*/
        //int arr[][] = new int[][]{{1,2},{3,4},{5,6}};  /*third approach*/
        int arr[][] = new int[3][2];     //fourth approach
        arr[0] = new int[]{1, 2};
        arr[1] = new int[]{3, 4};
        arr[2] = new int[]{5, 6};
        //Accessing values in the array
        for (int i = 0; i < arr.length; i++) {
            //printing all elements in an array without using a 1-d array
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            //printing all elements in array using a 1-d array
            int singleRow[] = arr[i];
            for(int j =0; j<singleRow.length;j++){
                System.out.print(singleRow[j]+" ");
            }
            System.out.println();
        }
        //only printing size in each row
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].length);
        }

        //printing overall size of array
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            size += arr[i].length;
        }
        System.out.println(size);

    }

}
