package com.java.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {

    public static void main(String[] args){

        HashSet<Integer> hashSet= new HashSet<Integer>();
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(40);
        for (Integer i: hashSet){
            System.out.println(i);
        }
        System.out.println(hashSet);

    }
}
