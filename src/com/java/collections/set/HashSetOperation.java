package com.java.collections.set;

import java.util.*;


public class HashSetOperation {

    public static void main(String[] args){
        Set<Employee> set = new HashSet<Employee>(Arrays.asList(new Employee(1, "Ram"), new Employee(2, "Rahman"), new Employee(2, "Rahman")));
        System.out.println(set);

        Set<Integer> nums = new LinkedHashSet<>();
        nums.add(null);
        nums.add(null);
        nums.add(null);
        System.out.println(nums);

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(null, null, null,1,3));
        System.out.println(num1);
    }

}
class  Employee{
    int id;
    String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
