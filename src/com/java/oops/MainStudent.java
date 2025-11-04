package com.java.oops;

public class MainStudent {

    public static void main(String[] args){
        Student firstStudent = new Student("Raghu", 9, 101, 95);
       oneStudent(firstStudent);
        Student secondStudent = new Student("Rishi", 1, 102, 95);
        secStudent(secondStudent);
        Student thirdStudent = new Student("Hani", 0, 103, 95);
       thirStudent(thirdStudent);
        Student fourthStudent = new Student("Susmi", 10, 104, 105);
        forStudent(fourthStudent);
        Student fifthStudent = new Student("Mani", 11, 105, 110);
         fifStudent(fifthStudent);
    }
    static void oneStudent(Student firstStudent){
        System.out.println("First Student Name: "+firstStudent.name);
        System.out.println("First Student class: "+firstStudent.cls);
        System.out.println("First Student id: "+firstStudent.id);
        System.out.println("First Student marks: "+firstStudent.marks);
        firstStudent.increaseMarks();
        System.out.println("First Student marks: "+firstStudent.marks);
        firstStudent.incClass();
        System.out.println("First Student class: "+firstStudent.cls);
    }
    static void secStudent(Student secondStudent){
        System.out.println("Second Student Name: "+secondStudent.name);
        System.out.println("Second Student class: "+secondStudent.cls);
        System.out.println("Second Student id: "+secondStudent.id);
        System.out.println("Second Student marks: "+secondStudent.marks);
        secondStudent.increaseMarks();
        System.out.println("Second Student marks: "+secondStudent.marks);
        secondStudent.incClass();
        System.out.println("Second Student class: "+secondStudent.cls);
    }
    static void thirStudent(Student thirdStudent){
        System.out.println("Third Student Name: "+thirdStudent.name);
        System.out.println("Third Student class: "+thirdStudent.cls);
        System.out.println("Third Student id: "+thirdStudent.id);
        System.out.println("Third Student marks: "+thirdStudent.marks);
        thirdStudent.increaseMarks();
        System.out.println("Third Student marks: "+thirdStudent.marks);
        thirdStudent.incClass();
        System.out.println("Third Student class: "+thirdStudent.cls);
    }
    static void forStudent(Student forthStudent){
        System.out.println("Fourth Student Name: "+forthStudent.name);
        System.out.println("Fourth Student class: "+forthStudent.cls);
        System.out.println("Fourth Student id: "+forthStudent.id);
        System.out.println("Fourth Student marks: "+forthStudent.marks);
        forthStudent.increaseMarks();
        System.out.println("Fourth Student marks: "+forthStudent.marks);
        forthStudent.incClass();
        System.out.println("Fourth Student class: "+forthStudent.cls);
    }
    static void fifStudent(Student fifthStudent){
        System.out.println("Fifth Student Name: "+fifthStudent.name);
        System.out.println("Fifth Student class: "+fifthStudent.cls);
        System.out.println("Fifth Student id: "+fifthStudent.id);
        System.out.println("Fifth Student marks: "+fifthStudent.marks);
        fifthStudent.increaseMarks();
        System.out.println("Fifth Student marks: "+fifthStudent.marks);
        fifthStudent.incClass();
        System.out.println("Fifth Student class: "+fifthStudent.cls);
    }
}
