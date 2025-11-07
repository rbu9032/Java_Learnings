package com.java.abstraction.clsabstraction;

import com.java.abstraction.clsabstraction.Animal;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Bow Bow!!...");
    }

    @Override
    public void sleeping() {
        super.sleeping();
        System.out.println("Dog is sleeping..");
    }
}

