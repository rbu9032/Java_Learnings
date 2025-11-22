package com.java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Banana","Watermelon","Banana","Apple","banana"));
        Map<String, Long> countOfFruits =fruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Frequency of Fruits type: "+countOfFruits);
        System.out.println("=======================================");
        String fruit = "Apple";
        Map<Character, Long> charCount = fruit.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Character count in fruit String: "+charCount);
        System.out.println("=======================================");
        int[] a = {1,2,3,4,5,6};
        Arrays.stream(a).filter(n->n%2==0).forEach(System.out::println);
    }
}
