package com.java.thomastravels;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDriver {

    public static void main(String[] args){

        Travel travel = new Travel();
        Driver driver1 = new Driver(1, "Ram", "Bus", 50000);
        Driver driver2 = new Driver(2, "Sandy", "Car", 90000);
        Driver driver3 = new Driver(3, "Jeevan", "Lorry", 100000);
        Driver driver4 = new Driver(4, "Basha", "Lorry", 220000);

        ArrayList<Driver> drivers = new ArrayList<Driver>();
        drivers.add(new Driver(1, "Ram", "Bus", 50000));
        drivers.add(new Driver(2, "Sandy", "Car", 90000));
        drivers.add(new Driver(3, "Jeevan", "Lorry", 100000));
        drivers.add(new Driver(4, "Basha", "Lorry", 220000));
        drivers.add(new Driver(5, "Sameer", "Lorry", 1000000));
        Scanner scanner = new Scanner(System.in);
       boolean isCar = travel.isCarDriver(driver1);
       System.out.println(isCar);
       String s = travel.retreiveByDriverId(drivers,2);
       System.out.println(s);
        System.out.println("Enter category");
       String enterCategory = scanner.next();
       int countOfDriver = travel.retrieveCountOfDriver(drivers,enterCategory);
       System.out.println(countOfDriver);
       ArrayList<Driver> driver = new ArrayList<Driver>();
       driver = travel.retrieveDrive(drivers, enterCategory);
       System.out.println(driver);
       Driver dv = travel.retrieveMaximumDistanceTravelledDriver(drivers);
       System.out.println(dv);


    }
}
