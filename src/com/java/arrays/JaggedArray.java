package com.java.arrays;

public class JaggedArray {

    public static void main(String[] args) {
        //creating an jagged array
        /*int arr[][] = new int[5][];
        //specifying no.of columns in each row
        arr[0] = new int[2];   //here 2 represent no.of columns
        arr[1] = new int[4];
        arr[2] = new int[5];
        arr[3] = new int[6];
        arr[4] = new int[7];
        //initializing values to the array
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[1][2] = 5;
        arr[1][3] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        arr[2][3] = 10;
        arr[2][4] = 11;
        arr[3][0] = 12;
        arr[3][1] = 13;
        arr[3][2] = 14;
        arr[3][3] = 15;
        arr[3][4] = 16;
        arr[3][5] = 17;
        arr[4][0] = 18;
        arr[4][1] = 19;
        arr[4][2] = 20;
        arr[4][3] = 21;
        arr[4][4] = 22;
        arr[4][5] = 23;
        arr[4][6] = 24;*/

        //or we can do the initialization and creating in the below approach
        /*int arr[][] = new int[3][];
        arr[0] = new int[]{1,2};
        arr[1] = new int[]{3,4,5};
        arr[2] = new int[]{6,7,8,9};*/

        //3rd approach for creation and initialization
        int arr[][] = {
                {1,2},
                {3,4,5},
                {6,7,8,9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
