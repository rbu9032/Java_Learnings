package com.java.collections.list;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args){
        //syntax
        ArrayList arrayList = new ArrayList();
        ArrayList a2 = new ArrayList();
        arrayList.add(10);
        arrayList.add(25.0);
        arrayList.add(false);
        arrayList.add("Fayaz");
        arrayList.add(new Employee("Ram", 26));
        arrayList.add(3,99);
        arrayList.set(0,"Jai");
        arrayList.remove(1);
        a2.add(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("dhobni"));
        System.out.println(arrayList.indexOf(99));
        System.out.println(a2);
        System.out.println(arrayList.get(4));
        ArrayList<Employee> arrayList1 = new ArrayList<Employee>();
        arrayList1.add(new Employee("RBBI", 56));
        arrayList1.add(new Employee("SFSG", 29));
        System.out.println(arrayList1.get(1).getName());
        System.out.println(arrayList1);
        //Employee employees = new Employee();
        for (int i = 0; i<arrayList1.size(); i++){
            System.out.println(arrayList1.get(i));
        }
    }
}
class Employee{

    String name;
    int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
