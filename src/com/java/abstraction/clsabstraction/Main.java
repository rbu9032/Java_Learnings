package com.java.abstraction.clsabstraction;

public class Main {
    public static void main(String[] args){
        Dog dg = new Dog();
        dg.sound();
        dg.sleeping();

        Car cr = new Car();
        cr.start();
        System.out.println(Vehicle.price);
    }

}
