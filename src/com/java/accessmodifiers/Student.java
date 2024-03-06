package com.java.accessmodifiers;

public class Student {
      protected int rollNo;

    protected Student(){
        rollNo=102;
    }

    protected void printRollNo(){
        System.out.println(rollNo);
    }
}
