package com.java.practice;

public class OperatorsPractice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 10;
        int j = 5;
        /*
         * Arithmetic operators System.out.println("Addition of i and j:"+(i+j));
         * System.out.println("Substraction of i and j:"+(i-j));
         * System.out.println("Multiplication of i and j:"+(i*j));
         * System.out.println("Division of i and j:"+(i/j));
         * System.out.println("Modulus of i and j:"+(i%j))
         */;

        /*
         * Unary operators System.out.println(i++); 10 System.out.println(++i);12
         * System.out.println(j); //5 System.out.println(j--); //5
         * System.out.println(--j); //3 System.out.println(j); //3
         */
        /*
         * Relational Operators System.out.println("i is equal to j:"+(i==j)); //false
         * System.out.println("i is not equal to j:"+(i!=j)); //true
         * System.out.println("i is greater than j:"+(i>j)); //true
         * System.out.println("i is greater than j:"+(i<j)); //false
         * System.out.println("i is greater than or equal to j:"+(i>=j)); //true
         * System.out.println("i is less than or equal to j:"+(i<=j)); //false
         */

        /*
         * Conditional Operators
         * System.out.println("Statement is:"+(j<i && i==j));//false
         * System.out.println("Statement is:"+(i>j || i==j)); //true
         *
         * System.out.println("Statement is:"+(i!=j || i<j)); //true
         * System.out.println("Statement is:"+(i<j || i>j)); //true
         * System.out.println("Statement is:"+(i==j || i>j)); //false
         */

        /* Assignment Operators
         * i +=5;
         * System.out.println(i); //15
         * i -=2;
         * System.out.println(i); //13
         *  i *= 3;
         * System.out.println(i); //39
         * i /=2;
         * System.out.println(i); //19
         * i%=2;
         * System.out.println(i); //1
         */
        int z=20;
        z= z++ + ++z +z-- - --z;  // 20+22= 42 + 21-19= 2
        System.out.println(z); //44
    }

}
