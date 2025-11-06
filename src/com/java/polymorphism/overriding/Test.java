package com.java.polymorphism.overriding;

public class Test {

     public static void main(String[] args){
        Remote rm = new Remote();
        rm.turnOn();
        TvRemote tv = new TvRemote();
        tv.turnOn();
        AcRemote ac = new AcRemote();
        ac.turnOn();
    }
}
