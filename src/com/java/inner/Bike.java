package com.java.inner;

public class Bike extends Vehicle{

    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }

    @Override
    public void drive() {
        System.out.println("Bike driving");
    }
}
