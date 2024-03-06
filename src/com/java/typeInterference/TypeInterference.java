package com.java.typeInterference;

public class TypeInterference {

    public static void main(String[] args) {
        var i = 23434;
        var s1 = "Var Keyword";
        var b1 = true;
        System.out.println(i);
        System.out.println(s1);
        System.out.println(b1);
        var var = 10;
        var = var + var;
        System.out.println(var);
        var arr = new int[]{1,2,3};
        var arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println(arr[2]);    //2
        System.out.println(arr1[0]);   //1
    }

}
