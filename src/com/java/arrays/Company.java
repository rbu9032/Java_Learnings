package com.java.arrays;

import java.util.Arrays;

public class Company {

    String name;
    Employee[] employees;

    public Company() {
    }

    public Company(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }

    public static void main(String[] args){
        Employee emp1 = new Employee(1, "RBU", 55000);
        Employee emp2 = new Employee(2, "UV", 45000);
        Employee emp3 = new Employee(3, "TU", 36000);

        Employee[] emp = new Employee[] {emp1, emp2, emp3};

        Company company = new Company("CG",emp);
        Company company1 = new Company("TCS",emp);


        System.out.println(company);
        System.out.println(company1);


    }
}
