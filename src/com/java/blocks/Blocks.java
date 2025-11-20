package com.java.blocks;

public class Blocks {

    public static void main(String[] args){
        System.out.println("From Main Method");
        Blocks blocks = new Blocks();
    }
    static {
        System.out.println("From static block");
    }
    static {
        System.out.println("From static block1");
    }
    {
        System.out.println("From instance block");
    }
}
