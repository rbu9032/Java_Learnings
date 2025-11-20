package com.java.clone;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("516360");
        Employee employee = new Employee(1,"WNF",address);
        System.out.println(employee);
        Employee employee1 = (Employee) employee.clone();
        System.out.println(employee1);
        employee.name = "EEEE";
        employee.address.pincode = "947946";
        System.out.println(employee);
        System.out.println(employee1);
    }
}
