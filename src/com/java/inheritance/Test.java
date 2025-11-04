package com.java.inheritance;

public class Test {

    public static void main(String[] args){
   /*    Parent pr = new Parent();
       System.out.println(pr.a);
       pr.m1();

       Child ch = new Child();
       System.out.println(ch.b);
       ch.m2();
       ch.m1();*/
        Car car = new Car();
        car.start();
        car.drive();
        System.out.println();
        FuelCar fc = new FuelCar();
        fc.start();
        fc.drive();
        fc.fuel();
    }
}
