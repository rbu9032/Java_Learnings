package com.singleton;

public class Test {

    public static void main(String[] args) {
//        Employee employee = new Employee();
//        Employee employee1 = new Employee();
//
//        System.out.println(employee.hashCode());
//        System.out.println(employee1.hashCode());
//        System.out.println(employee==employee1);
        Employee emp = Employee.getEmp();
        Employee emp1 = Employee.getEmp();
        System.out.println(emp.hashCode());
        System.out.println(emp1.hashCode());
        System.out.println(emp==emp1);
    }
}
