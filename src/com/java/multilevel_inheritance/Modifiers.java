package com.java.multilevel_inheritance;

import com.java.accessmodifiers.Student;

public class Modifiers extends Student {

    public static void main(String[] args) {
       new Modifiers().test();
    }

    public void test(){
        System.out.println(rollNo);
        printRollNo();
    }
}
