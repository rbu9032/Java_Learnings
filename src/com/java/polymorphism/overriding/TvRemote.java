package com.java.polymorphism.overriding;

public class TvRemote extends Remote{
    @Override
    void turnOn(){
        super.turnOn(); // calling parent class method
        System.out.println("TV turned on...");
    }
}
