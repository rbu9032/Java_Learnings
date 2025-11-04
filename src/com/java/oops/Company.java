package com.java.oops;

public class Company {

    static String companyName;
    String location;
    int numberOfEmployees;

    public Company(String companyName, String location, int numberOfEmployees) {
        this.companyName = companyName;
        this.location = location;
       this.numberOfEmployees = numberOfEmployees;
    }

     void printAll(){
        System.out.println("Company Name: "+companyName);
         System.out.println("Company Location: "+location);
         System.out.println("No.of employees in the company: "+numberOfEmployees);
     }
}
