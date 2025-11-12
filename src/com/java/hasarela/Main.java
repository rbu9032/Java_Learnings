package com.java.hasarela;

public class Main {

    public static void main(String[] args){
        Professor professor = new Professor();
        professor.setName("YUYI");
        professor.setSubject("Java");
        professor.setExperience(5);

        Department department1 = new Department();
        department1.setName("CSE");
        department1.setCountOfStudents(140);
        department1.setProfessor(professor);

        Department department2 = new Department();
        department2.setName("ECE");
        department2.setCountOfStudents(110);
        department2.setProfessor(new Professor("SAM", "C", 9));

        Department department3 = new Department("MECH", 70,new Professor("RAJU", "TM",15));

        System.out.println(department1);
        System.out.println(department2);
        System.out.println(department3);

    }
}
