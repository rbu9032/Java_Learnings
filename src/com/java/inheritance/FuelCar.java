package com.java.inheritance;

public class FuelCar extends Car{

    int fuelCapacity = 40;
    String color = "Red";

    public FuelCar() {
        System.out.println("FuelCar Object Created...");
    }

    void fuel(){
        System.out.println("Fueling Petrol...");
    }

    void print(){
        System.out.println(this.fuelCapacity);
        System.out.println(color);
        System.out.println(super.color);
    }
}
