package com.java8.functionalInterface;

public class Test implements Interface2, FunctionalInterfaces{
    @Override
    public void sayHi() {
        System.out.println("Hi..........");
    }

    @Override
    public void sayBye() {
        System.out.println("Bi..........");
    }

    @Override
    public void hi() {
        FunctionalInterfaces.super.hi();
        Interface2.super.hi();
    }
   /* @Override
    public void hi() {
        System.out.println("This is default hi method from child(Test) class");
    }*/
}
