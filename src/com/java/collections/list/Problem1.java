package com.java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Problem1 {

    public static void main(String[] args){
        countOfCharacters();
        System.out.println("==================================");
        countChars();
    }

/*    public static void countOfCharacters(){
        ArrayList<Character> arrayList = new ArrayList<Character>(Arrays.asList('A','B','A','C'));
        char a;
        int count = 0;
        for (int i=0; i<arrayList.size(); i++){
            count = 0;
            a = arrayList.get(i);
            for (int j = 0; j<arrayList.size(); j++){
                if (a == arrayList.get(j)){
                    count++;
                }
            }
            System.out.println(a +"="+count);
        }
    }*/

    public static void countOfCharacters(){
        ArrayList<Character> arrayList = new ArrayList<Character>(Arrays.asList('A','B','A','C'));
        int[] arr = new int[256];
       for (char c: arrayList){
           int num = c;
           arr[num]++;
        }
       for(int i=0; i<256; i++){
           if(arr[i]!=0){
               System.out.println((char) i +"="+arr[i]);
           }
       }
    }

    public static void countChars(){
        ArrayList<Character> arrayList = new ArrayList<Character>(Arrays.asList('A','B','A','C'));
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(char c: arrayList){
            if (map.containsKey(c)){
                int count = map.get(c);
                map.put(c, count+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
        for(Character c:map.keySet()){
            System.out.println(c +"="+map.get(c));
        }
    }

/*    public static void countChars(){
        ArrayList<Character> arrayList = new ArrayList<Character>(Arrays.asList('A','B','A','C'));
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(char c: arrayList){
            if (!map.containsKey(c)){
                map.put(c,1);
            }else{
                int count = map.get(c);
                map.put(c, count+1);
            }
        }
        System.out.println(map);
        for(Character c:map.keySet()){
            System.out.println(c +"="+map.get(c));
        }
    }*/
}
