package com.java.clone;

import java.util.Objects;

public class Employee implements Cloneable{

    int empId;
    String name;

    Address address;

    public Employee() {
    }

    public Employee(int empId, String name, Address address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee clonedEmp = (Employee) super.clone();
        clonedEmp.address = new Address(this.address.pincode);
        return clonedEmp;
    }
}
