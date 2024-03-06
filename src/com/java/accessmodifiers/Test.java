package com.java.accessmodifiers;

public class Test extends Student{

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.rollNo);
        s1.printRollNo();
    }
}
