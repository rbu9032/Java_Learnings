package com.java8.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10,10,4,4,10,12,65,87,87,5));
        //we can iterate list using for, for each loop, list, listIterator
        //iterating list with the help of lambda
        //list.forEach((l)-> System.out.println(l));
        //System.out.println("=========================================");
        //list.forEach(System.out::println);  //printing the list using method reference
        List<Integer> num = list
                                .stream()
                                .filter((n)->n%2==0)         //Intermediate operation
                                .collect(Collectors.toList()); //Terminal operation
        //System.out.println(num);
        //list.stream().filter((n)->n%2==0).forEach(System.out::println);
        //System.out.println("=========================================");
                    Set<Integer> num1 = list.stream().filter((n)->n%2==0).collect(Collectors.toSet());
        //System.out.println(num1);
        List<Integer> sortedList = list
                                  .stream()
                                  .sorted()
                                  .toList(); //Terminal operation used instead of .collect(Collectors.toList()); and works same as .collect(Collectors.toList()
        System.out.println("=========================================");
        System.out.println("Sorting using sorted method from streams");
        System.out.println(sortedList);
        System.out.println("=========================================");
        List<Integer> sortedList1 = list
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Reverse sorting using streams");
        System.out.println(sortedList1);
        System.out.println("=========================================");
        List<Employee> emp = new ArrayList<>(List.of(new Employee(1,"Sreenu",1100000),
                                                     new Employee(2,"Kiran",1000),
                                                     new Employee(3,"Ram",12000),
                                                     new Employee(4,"Naveen",2300000),
                                                     new Employee(5,"Karthik",110000)));
        System.out.println("=========================================");
        System.out.println("Employees salary greater than one lakh");
        emp.stream().filter((e)->e.salary>100000).forEach(System.out::println); //stream to get employees salary greater than one lakh
        System.out.println("=========================================");
        System.out.println("Sorting employees by salary");
        emp.stream().sorted((e1,e2)->Integer.compare(e1.salary,e2.salary)).forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("Sorting employees by name");
        emp.stream().sorted((e1,e2)->e1.name.compareTo(e2.name)).forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("Sorting employees by salary descending");
        emp.stream().sorted((e1,e2)->Integer.compare(e2.salary,e1.salary)).forEach(System.out::println);
        System.out.println("=========================================");
        /*System.out.println("Incrementing salary for employees");
        emp.stream().map((e)->e.salary+=5000).forEach(System.out::println);*/ // this will only print the salary because in the map method we are only taking employee salary
        System.out.println("=========================================");
        System.out.println("Incrementing salary for employees and printing total employee list");
        emp.stream().map((e)-> new Employee(e.id, e.name, (e.salary+=5000))).forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("Stream to get employees name starting with K");
        emp.stream().filter((e)->e.name.startsWith("K")).forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println(list);
        System.out.println("Removing duplicates from the list");
        List<Integer> unique = list.stream().distinct().toList();
        System.out.println(unique);
        System.out.println("=========================================");
        System.out.println("Finding highest value in list");
        Integer  i = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(i);
        System.out.println("=========================================");
        System.out.println(list);
        System.out.println("Finding highest second value in list");
        Integer i1= list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(i1);
    }
}
