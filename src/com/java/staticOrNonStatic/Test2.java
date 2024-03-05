package com.java.staticOrNonStatic;

public class Test2 {
    int number;
    static {
        System.out.println("static block");
    }
    {
        System.out.println("non-static block");
    }
    public Test2() {
        System.out.println("constructor");
        //number=10;
    }
    public static void main(String[] args) {
//         Test1.print();
        System.out.println("main method");
       Test2 t2 = new Test2();
        Test2 t1 = new Test2();
        Test2 t3 = new Test2();
        Test2 t4 = new Test2();
        Test2 t5 = new Test2();


        //System.out.println(t2.number);
    }
}
