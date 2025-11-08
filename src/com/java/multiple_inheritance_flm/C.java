package com.java.multiple_inheritance_flm;

public class C implements A, B{
    @Override
    public void m1() {
        System.out.println("Hi I'm m1");
    }

    @Override
    public void m2() {
      System.out.println("Hi I'm m2");
    }
}
