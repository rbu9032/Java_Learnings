package com.java8.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Reduce {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6));
        Integer sum = nums.stream().reduce(0,(a,b)->a+b);
        //or
        //Integer sum = nums.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum of numbers in the nums list: "+sum);
        Integer product = nums.stream().reduce(1,(a, b)->a*b);
        System.out.println("=================================");
        System.out.println("Product of values in num list: "+product);
        System.out.println("=================================");
        List<String> words = new ArrayList<>(List.of("We ","are","coding","with","streams"));
        String str = words.stream().reduce("",(w1,w2)->w1+" "+w2);
        System.out.println("Concatenating a string:"+str.trim());
    }

}
