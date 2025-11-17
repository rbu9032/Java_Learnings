package com.java.thomastravels;

import java.util.ArrayList;
import java.util.Objects;

public class Travel {


    public  boolean isCarDriver(Driver driver){
        boolean isCar = false;
        if(driver.getCategory().equalsIgnoreCase("CAR")){
            isCar = true;
        }
        return isCar;
    }

    public String retreiveByDriverId(ArrayList<Driver> drivers, int driverId){
         for (Driver driver: drivers) {
             if (driver.getDriverId() == driverId) {
                 return  "Driver name is " + driver.getDriverName() + " Belonging to the category " + driver.getCategory() + " travelled " + driver.getTotalDistance();
             }
         }
         return "No results found for given driver id";

    }

    public int retrieveCountOfDriver(ArrayList<Driver> drivers,String category){
        int count = 0;
        for (Driver driver: drivers){
            if(driver.getCategory().equalsIgnoreCase(category)){
                count++;
            }
        }
        return count;
    }

    public ArrayList<Driver> retrieveDrive(ArrayList<Driver> drivers, String category){
        ArrayList<Driver> dv = new ArrayList<Driver>();
          for (Driver driver: drivers){
            if (driver.getCategory().equalsIgnoreCase(category)){
                dv.add(driver);
            }
          }
          return dv;
    }

    public Driver retrieveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers){
        Driver maxDriver = drivers.get(0);
        for (Driver dr: drivers){
            if (dr.getTotalDistance() > maxDriver.getTotalDistance()){
                   maxDriver = dr;
            }
        }
        return maxDriver;
    }
}
