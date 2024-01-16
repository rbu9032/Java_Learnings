package com.java.arrays;

import com.java.practice.Bank;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionalArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a1[] = {23,45,23,44,54};
        //creating arrays in different ways
         /* int i[] = new int[4];
        i[0] = 31;
        i[1] = 21;
        i[2] = 465;
        i[3] = 76;*/
        //creating arrays in different ways
        //int i[] = new int[] {23,54,34,65,76};


        //accessing values through for loop in array and printing in console
        /*for(int j=0; j<i.length; j++){
            System.out.println(i[j]);
        }*/
        //accessing values through while loop in array and printing in console
        /*int j = 0;
        while (j<i.length){
            System.out.println(i[j]);
            j++;
        }
        System.out.println("Sum of all values in Array-i");
        int sum =i[0]+i[1]+i[2]+i[3];
        System.out.println(sum);
        //printing size of array
        System.out.println("Size of array:"+i.length);*/

        //Assignment-1 Print the sum of integers in an integer array
       /* System.out.println("Enter the array size:");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        System.out.println("Enter the array values:");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input: "+Arrays.toString(arr));
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of all elements: "+sum);*/


        //Assignment-2 Print the average of the integers in an integer array
 /*       System.out.println("Enter the array size:");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        System.out.println("Enter the array values:");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input: "+Arrays.toString(arr));
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Average: "+sum/arr.length);*/


        //Assignment-3 Merge two arrays and print the output in the console
       /* System.out.println("Enter the array1 size:");
        int arr1Size = sc.nextInt();
        String arr1[] = new String[arr1Size];
        System.out.println("Please enter the array-1 values:");
        for(int i=0; i<arr1Size; i++){
            arr1[i] = sc.next();
        }
        System.out.println("Enter the array2 size:");
        int arr2Size = sc.nextInt();
        String arr2[] = new String[arr2Size];
        System.out.println("Please enter the array-1 values:");
        for(int i=0; i<arr2Size; i++){
            arr2[i] = sc.next();
        }
        System.out.println("Input-1: "+Arrays.toString(arr1));
        System.out.println("Input-2: "+Arrays.toString(arr2));
        String arr3[] = new String[arr1.length + arr2.length];
        for(int i =0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for(int i =0; i<arr2.length; i++){
            arr3[i+ arr1.length] = arr2[i];
        }
        System.out.println("Output: "+Arrays.toString(arr3));*/

        //Assignment-4 Find the max number from an array and print it along with its index
      /*  System.out.println("Enter the array size:");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        System.out.println("Enter the array values:");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input: "+Arrays.toString(arr));
        int largestNumber = arr[0];
        int largestNumberIndex = 0;
        for(int i=0; i<arr.length;i++){
           if(largestNumber<arr[i]){
               largestNumber = arr[i];
               largestNumberIndex = i;
           }
        }
        System.out.println("Largest number: "+largestNumber);
        System.out.println("Index of largest number: "+largestNumber);*/

        //Assignment-5 Find min length word from an array and print it along with its index
      /*  System.out.println("Enter the array1 size:");
        int arrSize = sc.nextInt();
        String arr[] = new String[arrSize];
        System.out.println("Please enter the array-1 values:");
        for(int i=0; i<arrSize; i++){
            arr[i] = sc.next();
        }
        System.out.println("Input: "+Arrays.toString(arr));
        String minLengthWord = arr[0];
        int minLengthWordIndex = 0;
        for(int i=0; i<arr.length;i++){
            if(minLengthWord.length() > arr[i].length()){
                minLengthWord = arr[i];
                minLengthWordIndex = i;
            }
        }
        System.out.println("Min Length word in the array : "+minLengthWord);
        System.out.println("Index of min length word: "+minLengthWordIndex);*/

       /* //Assignment - 6 Reverse the array and print its console
        System.out.println("Enter the array1 size:");
        int arrSize = sc.nextInt();
        boolean arr[] = new boolean[arrSize];
        System.out.println("Please enter the array values:");
        for(int i=0; i<arrSize; i++){
            arr[i] = sc.nextBoolean();
        }
        System.out.println("Input: "+Arrays.toString(arr));
        boolean revArr[] = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++){
            revArr[arr.length - i - 1] = arr[i];
        }
        System.out.println("Output: "+Arrays.toString(revArr));*/


        //Assignment-6 Find the second-highest number from an array and
        /*System.out.println("Enter the array size:");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        System.out.println("Enter the array values:");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input: "+Arrays.toString(arr));
        int largestNumber = arr[0];
        int secondLargestNumber = arr[0];
        int largestNumberIndex = 0;

        for(int i=0; i<arr.length;i++){
           if(arr[i]>largestNumber){
               secondLargestNumber = largestNumber;
               largestNumber = arr[i];
               largestNumberIndex = i;
           } else if (arr[i] > secondLargestNumber && arr[i] < largestNumber) {
               secondLargestNumber = arr[i];

           }
        }
        System.out.println("Largest number: "+largestNumber);
        System.out.println("Index of largest number: "+largestNumberIndex);
        System.out.println("Second largest number: "+secondLargestNumber);*/


        //Assignment-8 Find the second-highest number from an array and print it along with its index
        System.out.println("Enter the array size:");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        System.out.println("Enter the array values:");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input: " + Arrays.toString(arr));
        int largestNumber = arr[0];
        int secondLargestNumber = arr[0];
        int largestNumberIndex = 0;
        int secondLargestNumberIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                secondLargestNumberIndex = largestNumberIndex;
                largestNumber = arr[i];
                largestNumberIndex = i;
            }
        }
        System.out.println("size of array:"+arr.length);
        System.out.println("Largest number: " + largestNumber);
        System.out.println("Index of largest number: " + largestNumberIndex);
        System.out.println("Second largest number: " + secondLargestNumber);
        System.out.println("Index of second largest number:" + secondLargestNumberIndex);


        sc.close();
    }
}
