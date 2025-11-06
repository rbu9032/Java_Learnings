package com.java.polymorphism.overriding;

public class AcRemote extends Remote {

    @Override
    void turnOn(){
        System.out.println("AC turned on...");
    }
}
