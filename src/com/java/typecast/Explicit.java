package com.java.typecast;

public class Explicit {

    public static void main(String[] args){

        short s = 65;
        byte b = (byte)s;   //explicit type casting
        char c =(char) s;
        int n = 'A'; //A has ASCI values of 67
        int i = (int) 12.231f;
        System.out.println("Short: "+ s);
        System.out.println("Byte: "+ b);
        System.out.println("Char: "+ c);
        System.out.println("Int: "+ n);
        System.out.println("Int: "+ i);
    }
}
