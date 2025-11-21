package com.java8.comparablecomparator;

public class Student implements Comparable<Student> {

    int id;
    String name;

    public Student(){

    }

    public Student(int id, String name) {
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //return (this.id == o.id)?0:(this.id>o.id)?-1:1; //int comparison
        //return Integer.compare(this.id, o.id);      //int comparison
        return this.name.compareTo(o.name);  //string comparison
    }
}
