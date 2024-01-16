package com.java.practice;

/**
 * @author Raghavendr Babu Ummadisetty
 * @version 1.0.0
 * @description This class is used to demonstrate object in java
 * And explaining the ways to allocate memory to the variables
 */
public class Objects {
    int i;
    int j;
    public Objects() {
        i=10;
        j=20;
    }

    public Objects(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public static void main(String[] args) {
        /*Test test1 = new Test();
        Test test2 = new Test();
        Test test3 = new Test();
        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
        System.out.println(test3.hashCode());
        Test t1 = new Test(10);
        Test t2 = new Test(20);
        Test t3 = new Test(30);
        System.out.println(t1.i);
        System.out.println(t2.i);
        System.out.println(t3.i);
*/
     Objects t1 = new Objects();
     Objects t2 = new Objects(20, 30);
        System.out.println("For parameter less constructor");
        System.out.println(t1.add());   //30
        System.out.println(t1.sub());   //10
        System.out.println(t1.mul());   //200
        System.out.println(t1.div());   //2
        System.out.println(t1.mod());   //0
        System.out.println("For parameterized constructor");
        System.out.println(t2.add());   //50
        System.out.println(t2.sub());   //10
        System.out.println(t2.mul());   //600
        System.out.println(t2.div());   //1
        System.out.println(t2.mod());   //10

        System.out.println(t1 == t2);      //to compare two objects
        System.out.println(t1.equals(t2)); //to compare two objects

        System.out.println("Accessing variables using instances");
        System.out.println(t1.i);
        System.out.println(t1.j);
        System.out.println(t2.i);
        System.out.println(t2.j);
    }
    public int add(){
        return i+j;
    }
    public int sub(){
        return j-i;
    }
    public int mul() {
        return i*j;
    }
    public int div(){
        return j/i;
    }
    public int mod(){
        return j%i;
    }
}
