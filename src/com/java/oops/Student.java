package com.java.oops;

public class Student {

    String name;
    int cls;
    int id;
     int marks;

     Student(){

     }

     Student(String sName, int scls, int identity, int score){
         name = sName;
         cls = scls;
         id  = identity;
         marks = score;
     }
     void increaseMarks(){
         marks += 5;
     }
     void incClass(){
         cls++;
     }
}
