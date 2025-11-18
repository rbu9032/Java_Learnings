package com.java.collections.set;

import java.util.*;

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

        //Set set = new TreeSet(Arrays.asList(1,2,"ABC"));
        //System.out.println(set);  //This will throw run time exception(ClassCastException) because TreeSet will try to compare the elements, Since num has both integers and strings this will throw exception

        Set<Integer> nums = new LinkedHashSet<Integer>(Arrays.asList(12,65,4,146,78,56));
        System.out.println(nums);
    }
}
