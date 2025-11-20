package com.java8.functionalInterface;

public interface Interface2 {

    public void sayHi();

    default void sayBye(){
        System.out.println("This is default method Bye from Interface2");

    }
    default void defaultMethod(){
        System.out.println("This is default method from Interface2");
    }
    default void hi(){
        System.out.println("This is default hi method from Interface2");
    }

    static void staticMethod(){
        System.out.println("This is static method from Interface2");
    }
}
