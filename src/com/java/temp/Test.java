package com.java.temp;

import com.java.accessmodifiers.Student;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter array elements");
        int indexPos;
        for( indexPos = 0; indexPos<N; indexPos++){
               arr[indexPos] = sc.nextInt();
        }
        for( indexPos=0; indexPos<N; indexPos++){
            System.out.println(arr[indexPos]+ " ");
        }

        /*Student st = new Student();
        System.out.println(st.rollNo);
        st.printRollNo();*/
    }
}
