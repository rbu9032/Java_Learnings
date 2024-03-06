package com.java.accessmodifiers;

public class Teacher {

    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.rollNo);
        st.printRollNo();

    }
}
