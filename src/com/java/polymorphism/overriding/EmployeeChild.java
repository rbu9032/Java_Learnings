package com.java.polymorphism.overriding;

public class EmployeeChild extends Employee{
    @Override
    public void m1(){
        System.out.println("From Child M1");
    }

    @Override
    protected void m2() {
       System.out.println("From Child M2");
    }
    @Override
    protected void m4(){
        System.out.println("From Child M4");
    }
}
