package com.java.thomastravels;

import java.util.ArrayList;
import java.util.List;
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
        boolean isACar = travel.isCarDriver(driver1);
        System.out.println("Using Streams:"+isACar);
       String s = travel.retreiveByDriverId(drivers,2);
       System.out.println(s);
        String s1 = travel.retreiveADriverById(drivers,2);
        System.out.println("=========================================");
        System.out.println("Finding driver by id using streams:"+s1);
        System.out.println("=========================================");
        System.out.println("Enter category");
       String enterCategory = scanner.next();
       int countOfDriver = travel.retrieveCountOfDriver(drivers,enterCategory);
       System.out.println(countOfDriver);
        System.out.println("=========================================");
       long countOfDriver1=travel.retrieveACountOfDriver(drivers,enterCategory);
        System.out.println("Count of drivers for a given category using streams: "+countOfDriver1);
        System.out.println("=========================================");
        ArrayList<Driver> driver = new ArrayList<Driver>();
       driver = travel.retrieveDrive(drivers, enterCategory);
       System.out.println(driver);
        System.out.println("=========================================");
        List<Driver> dvr = new ArrayList<Driver>();
        dvr =  travel.retrieveAllDrive(drivers, enterCategory);
        System.out.println("List of drivers of with same category using streams: ");
        System.out.println(dvr);
        System.out.println("=========================================");
       Driver dv = travel.retrieveMaximumDistanceTravelledDriver(drivers);
       System.out.println(dv);
        System.out.println("=========================================");
        Driver dv7 = travel.retrieveMaximumDistanceTravelledByADriver(drivers);
        System.out.println("Maximum distance travelled by a driver:" +dv7);


    }
}
