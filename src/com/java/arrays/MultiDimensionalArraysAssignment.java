package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArraysAssignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Assignment-1 Print the sum of the elements of a multidimensional array
 /*       System.out.println("Enter no.of rows:");
        int rowSize = sc.nextInt();
        int arr[][] = new int[rowSize][];
        for (int i = 0; i < rowSize; i++) {
            System.out.println("Enter column size in row number:" + i);
            int columnSize = sc.nextInt();
            arr[i] = new int[columnSize];
            System.out.println("Enter the column values for row number:" + i);
            for (int j = 0; j < columnSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum =0;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Output:"+sum);*/


        //Assignment-2 Add the elements in two separate multidimensional arrays and print it to the console
        /*System.out.println("Enter no.of rows in array-1:");     //First multidimensional array
        int rowSize1 = sc.nextInt();
        int arr1[][] = new int[rowSize1][];
        for (int i = 0; i < rowSize1; i++) {
            System.out.println("Enter column size in row number:" + i);
            int columnSize1 = sc.nextInt();
            arr1[i] = new int[columnSize1];
            System.out.println("Enter the column values for row number:" + i);
            for (int j = 0; j < columnSize1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        //Second multidimensional array
        System.out.println("Enter no.of rows in array-2:");
        int rowSize2 = sc.nextInt();
        int arr2[][] = new int[rowSize2][];
        for (int i = 0; i < rowSize2; i++) {
            System.out.println("Enter column size in row number:" + i);
            int columnSize2 = sc.nextInt();
            arr2[i] = new int[columnSize2];
            System.out.println("Enter the column values for row number:" + i);
            for (int j = 0; j < columnSize2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int arr3[][] = new int[arr1.length][];
        for(int i = 0; i<arr1.length;  i++){
            arr3[i] = new int[arr1[i].length];
            for(int j = 0; j<arr1[i].length; j++){
                  arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Input-1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        System.out.println("Input-2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }

        System.out.println("Output of adding of elements in two multidimensional array:");
        for (int i=0; i< arr3.length; i++){
            System.out.println(Arrays.toString(arr3[i]));
        }*/

        //Assignment-3 Create an array with squares of the existing array elements
/*      System.out.println("Enter no.of rows:");
        int rowSize = sc.nextInt();
        int arr[][] = new int[rowSize][];
        for (int i = 0; i < rowSize; i++) {
            System.out.println("Enter column size in row number:" + i);
            int columnSize = sc.nextInt();
            arr[i] = new int[columnSize];
            System.out.println("Enter the column values for row number:" + i);
            for (int j = 0; j < columnSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int arr2[][] = new int[arr.length][];
        for(int i = 0; i<arr.length;  i++){
            arr2[i] = new int[arr[i].length];
            for(int j = 0; j<arr[i].length; j++){
                //arr2[i][j] = arr[i][j] * arr[i][j];
                //OR
                arr2[i][j] = (int) Math.pow(arr[i][j],2);
            }
        }
        System.out.println("Output array with squares of the existing array elements:");
        for (int i=0; i< arr2.length; i++){
            System.out.println(Arrays.toString(arr2[i]));
        }*/


        //Assignment-4 create an array based on the below condition
        /*
         Create an array based on the condition
         that if both elements in array-1 and array-3 matches enter 1 in the 3rd array,
          if it doesn't match enter 0 in the 3rd array */

/*      System.out.println("Enter no.of rows in array-1:");     //First multidimensional array
        int rowSize1 = sc.nextInt();
        int arr1[][] = new int[rowSize1][];
        for (int i = 0; i < rowSize1; i++) {
            System.out.println("Enter column size in row number:" + i);
            int columnSize1 = sc.nextInt();
            arr1[i] = new int[columnSize1];
            System.out.println("Enter the column values for row number:" + i);
            for (int j = 0; j < columnSize1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        //Second multidimensional array
        System.out.println("Enter no.of rows in array-2:");
        int rowSize2 = sc.nextInt();
        int arr2[][] = new int[rowSize2][];
        for (int i = 0; i < rowSize2; i++) {
            System.out.println("Enter column size in row number:" + i);
            int columnSize2 = sc.nextInt();
            arr2[i] = new int[columnSize2];
            System.out.println("Enter the column values for row number:" + i);
            for (int j = 0; j < columnSize2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input-1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        System.out.println("Input-2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }

        int arr3[][] = new int[arr1.length][];
        for(int i = 0; i<arr1.length;  i++){
            arr3[i] = new int[arr1[i].length];
            for(int j = 0; j<arr1[i].length; j++){
                if(arr1[i][j] == arr2[i][j]) {
                    arr3[i][j] =1;
                }else {
                    arr3[i][j] =0;
                }
            }
        }

        System.out.println("Output array:");
        for (int i=0; i< arr3.length; i++){
            System.out.println(Arrays.toString(arr3[i]));
        }*/

        //Assignment-5 --Interchange the values of an array by transposing the index values
/*        System.out.println("Enter no.of rows:");
        int rowSize = sc.nextInt();
        int arr[][] = new int[rowSize][];
        for (int i = 0; i < rowSize; i++) {
            System.out.println("Enter column size in row number:" + i);
            int columnSize = sc.nextInt();
            arr[i] = new int[columnSize];
            System.out.println("Enter the column values for row number:" + i);
            for (int j = 0; j < columnSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int arr2[][] = new int[arr.length][];
        for(int i = 0; i<arr.length;  i++){
            arr2[i] = new int[arr[i].length];
            for(int j = 0; j<arr[i].length; j++){
                arr2[i][j] = arr[j][i];
                  //a00 = a00
                  //a01 = a10
            }
        }
        System.out.println("Output array with squares of the existing array elements:");
        for (int i=0; i< arr2.length; i++){
            System.out.println(Arrays.toString(arr2[i]));
        }*/


        //Assignment-6 Print the common elements between two arrays
        /*System.out.println("Enter no.of rows in array-1:");     //First multidimensional array
        int rowSize1 = sc.nextInt();
        int arr1[][] = new int[rowSize1][];
        for (int i = 0; i < rowSize1; i++) {
            System.out.println("Enter column size in row number:" + i);
            int columnSize1 = sc.nextInt();
            arr1[i] = new int[columnSize1];
            System.out.println("Enter the column values for row number:" + i);
            for (int j = 0; j < columnSize1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        //Second multidimensional array
        System.out.println("Enter no.of rows in array-2:");
        int rowSize2 = sc.nextInt();
        int arr2[][] = new int[rowSize2][];
        for (int i = 0; i < rowSize2; i++) {
            System.out.println("Enter column size in row number:" + i);
            int columnSize2 = sc.nextInt();
            arr2[i] = new int[columnSize2];
            System.out.println("Enter the column values for row number:" + i);
            for (int j = 0; j < columnSize2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }*/

        int arr1[][] = new int[][]{
                {1, 2, 1},
                {9, 7, 2},
                {7, 6, 4}
        };

        int arr2[][] = new int[][]{
                {2, 6, 8, 6},
                {0, 1, 3, 9, 7},
                {7, 2, 0},
                {0, 1, 2, 2, 3, 4, 5, 6}
        };

        System.out.println("Input-1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        System.out.println("Input-2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }

        boolean isFound = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                int targetElement = arr1[i][j];

                for (int k = 0; k < arr2.length; k++) {
                    isFound = false;
                    for (int l = 0; l < arr2[k].length; l++) {
                        if (targetElement == arr2[k][l]) {
                            System.out.println(targetElement);
                            isFound = true;
                            break;
                        }
                    }
                    if (isFound) {
                        break;
                    }
                }

            }

        }

        sc.close();
    }

}
