package com.java.exceptionhandling;

public class Test2 {

    public static void main(String[] args){

          //int x = calculate();
         // System.out.println(x);
        System.out.println(calculate());
    }

    static int calculate(){

        try {
            int a = 10/0;
            return a;
        }catch (ArithmeticException e){
            System.out.println(e);
            return 0;
        }
        finally {
            System.out.println("From Finally");
            return 1;
        }
    }
}
