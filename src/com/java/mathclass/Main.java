package com.java.mathclass;

import java.util.Random;

public class Main {

    public static void main(String[] args){
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(10, 5));
        System.out.println(Math.min(5, 25));
        System.out.println(Math.round(5.5));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.floor(5.9));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.cbrt(125));
        System.out.println(Math.tan(Math.PI/4));
        System.out.println(Math.random());

        Random random = new Random();
        System.out.println(random.nextInt(1,50));

    }
}
