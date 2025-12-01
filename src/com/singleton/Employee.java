package com.singleton;

public class Employee {

    private static Employee emp;
    private Employee(){

    }

    public static Employee getEmp() {
        if (emp==null){
            emp = new Employee();
        }
        return emp;
    }
}
