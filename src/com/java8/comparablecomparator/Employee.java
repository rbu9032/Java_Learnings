package com.java8.comparablecomparator;

public class Employee {

    int empId;
    String domain;
    String empName;

    public Employee(){

    }

    public Employee(int empId, String domain, String empName) {
        this.empId = empId;
        this.domain = domain;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", domain='" + domain + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }
}
