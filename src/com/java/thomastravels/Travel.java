package com.java.thomastravels;

import java.util.*;

public class Travel {


    public  boolean isCarDriver(Driver driver){
        boolean isCar = false;
        if(driver.getCategory().equalsIgnoreCase("CAR")){
            isCar = true;
        }
        return isCar;
    }
    public  boolean isACarDriver(Driver driver){
        return driver.getCategory().equalsIgnoreCase("CAR");
    }

    public String retreiveByDriverId(ArrayList<Driver> drivers, int driverId){
         for (Driver driver: drivers) {
             if (driver.getDriverId() == driverId) {
                 return  "Driver name is " + driver.getDriverName() + " Belonging to the category " + driver.getCategory() + " travelled " + driver.getTotalDistance();
             }
         }
         return "No results found for given driver id";

    }
    public String retreiveADriverById(ArrayList<Driver> drivers, int driverId){
       return drivers.stream().filter((d)->d.getDriverId()==driverId)
                             .findFirst()
                             .map(d->String.format("Driver name is %s belonging to the category %s travelled %s",d.getDriverName(),d.getCategory(),d.getTotalDistance()))
                             .orElse("No results found for given driver id");

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

    public long retrieveACountOfDriver(ArrayList<Driver> drivers,String category){
       long countofDriversbyCategory= drivers.stream().filter(d->d.getCategory().equalsIgnoreCase(category)).count();
       return countofDriversbyCategory;
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
    public List<Driver> retrieveAllDrive(ArrayList<Driver> drivers, String category){
         List<Driver> dr =drivers.stream().filter(d->d.getCategory().equalsIgnoreCase(category)).toList();
          return dr;
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

    public Driver retrieveMaximumDistanceTravelledByADriver(ArrayList<Driver> drivers){
      return drivers.stream().sorted((d1,d2)->Double.compare(d2.getTotalDistance(), d1.getTotalDistance())).findFirst().get();
    }
}
