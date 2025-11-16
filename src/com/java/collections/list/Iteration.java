package com.java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration {

    public static void main(String[] args){

        Student student1 = new Student(1, "ABC");
        Student student2 = new Student(2, "DFG");
        Student student3 = new Student(3, "HJK");
        Student student4 = new Student(4, "GHJ");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

      /*  for (Student student: students){
            System.out.println(student);
        }*/
        //Iterator
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student);
        }
        System.out.println("-------------------------");
        ListIterator<Student> listIterator = students.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.hasPrevious());
        System.out.println(listIterator.hasNext());
    }
}
class Student{
    int id;
    String name;

    public Student() {
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
}
