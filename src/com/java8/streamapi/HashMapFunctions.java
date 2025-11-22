package com.java8.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapFunctions {

    public static void main(String[] args) {
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1,"Ram");
        names.put(2,"Srinu");
        names.put(3,"Surya");

        names.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() +" - "+ entry.getValue())); //printing has map with entrySet
        System.out.println("==================================");
        names.keySet().forEach(key -> System.out.println(key)); //printing only keys
        System.out.println("==================================");
        names.values().forEach(value -> System.out.println(value)); //printing only values
        System.out.println("==================================");
        //names.entrySet().forEach(entry -> System.out.println(entry.getKey() +" - "+ entry.getValue()));
        //System.out.println("==================================");
       // names.forEach((key, value) -> System.out.println(key + " - " + value));
        names.entrySet().stream().filter(k -> k.getKey()>=2).forEach(System.out::println); // code to print keys that are greater than 2 without collecting to map
        System.out.println("==================================");
        Map<Integer, String> map = names.entrySet().stream().filter(e->e.getKey()>=2).collect(Collectors.toMap(e-> e.getKey(), e->e.getValue()));  // code to print keys that are greater than 2 with collecting to map
        System.out.println(map);
        System.out.println("==================================");
        List<Map.Entry<Integer,String>> list = names.entrySet().stream().filter(e->e.getKey()>=2).toList();// code to print keys that are greater than 2 with collecting to list
        System.out.println(list);
        System.out.println("==================================");
        Map<String, String> course = new HashMap<>();
        course.put("Ram","Java");
        course.put("Sameer","Python");
        course.put("Swamy","JaVa");
        course.put("Jayanth","Java");
        course.entrySet().stream().filter(e-> e.getValue().equalsIgnoreCase("Java")).map(e->e.getKey()).forEach(System.out::println);
        System.out.println("==================================");
        Map <String, String> java = course.entrySet().stream().filter(e-> Objects.equals(e.getValue(), "Java")).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
        System.out.println(java);
        System.out.println("==================================");
        List<Integer> even = new ArrayList<>(Arrays.asList(12,16,8,4,3,5));
        long count = even.stream().filter(e->e%2==0).count(); //
        System.out.println("Count of even numbers in the list: " +count);
        System.out.println("==================================");
        int sum = even.stream().mapToInt(e->e).sum();
        System.out.println("Sum of numbers in the list: "+sum);
        System.out.println("==================================");
        even.stream().filter(e->e%5==0).forEach(e-> System.out.println("Multiples of 5 from the list:" +e));
        System.out.println("==================================");
        OptionalDouble average = even.stream().mapToInt(e->e).average();
        System.out.println("Average of list: "+average.getAsDouble());
        System.out.println("==================================");
        int max = even.stream().mapToInt(e->e).max().getAsInt();
        System.out.println("Max value in the list: "+max);
        System.out.println("==================================");
        int min = even.stream().mapToInt(e->e).min().getAsInt();
        System.out.println("Min values in the list: "+min);
        System.out.println("==================================");
        //flattenMap
        List<List<String>> words = new ArrayList<List<String>>();
        words.add(Arrays.asList("Hi","Bye"));
        words.add(Arrays.asList("One","Two"));
        words.add(Arrays.asList("Three","Four"));
        System.out.println(words);
        System.out.println("==================================");
        List<String> mergestList = words.stream().flatMap(e->e.stream()).toList();
        System.out.println("Merged list: "+mergestList);
        System.out.println("==================================");
        even.parallelStream().forEach(e->System.out.println(e));
        System.out.println("==================================");
        System.out.println("Printing only 3 values from the list: ");
        even.stream().limit(3).forEach(e-> System.out.println(e));
        System.out.println("==================================");
        boolean allMatch = even.stream().allMatch(e->e>=2);
        System.out.println("All match function: "+allMatch);

    }
}
