package com.java.collections.list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListOperation {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,56,78,65,45,2));
        System.out.println(list); //1,56,78,65,45,2
        System.out.println("===============");
        System.out.println(list.get(2)); //78
        System.out.println("===============");
        list.addFirst(18);
        System.out.println(list);  //18,1,56,78,65,45,2
        System.out.println("===============");
        list.addLast(12);
        System.out.println(list); //18,1,56,78,65,45,2,12
        System.out.println("================");
    }
}
