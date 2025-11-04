package com.java.oops;

public class Bike {

        int gear;
        int speed;
        String color;
        int petrolCapacity;
        Bike(){
            System.out.println("Creating Object");
        }
        Bike(String newColor){
            color = newColor;
        }
        void applyGear(){
            gear++;
        }
        void applySpeed(){
            speed +=20;
        }
        void brake(){
            gear--;
            speed -=10;
        }
}
