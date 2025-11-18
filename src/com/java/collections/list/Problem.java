package com.java.collections.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class Problem {

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(20);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(4);
        System.out.println(arrayList);
        int temp = 0;
        boolean isTrue = false;
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
      for (int i=0; i<arrayList.size(); i++){
          temp = arrayList.get(i);
          if (isTrue == arrayList1.contains(temp)) {
              arrayList1.add(temp);
          }
      }
        System.out.println(arrayList1);
    }
}
