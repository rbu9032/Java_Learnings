package com.java.oops;

public class Main {

    public static void main(String[] args){
        //Bike myBike = new Bike();
        //Bike friendBike = new Bike();
        Bike secondBike = new Bike("Blue");
        //System.out.println("Second Bike Color: "+secondBike.color);
       //firstBike(myBike);
       //frndBike(friendBike);
        Company myCompany = new Company("FLM","HYD",10214);
        Company friendCompany = new Company("FLM","BLR", 30454);
        System.out.println("My company details");
        myCompany.printAll();
        System.out.println("Friend company details");
        friendCompany.printAll();
        friendCompany.companyName="XYZ";
        myCompany.printAll();
        friendCompany.printAll();
    }

        private static void firstBike(Bike myBike) {
        myBike.color = "Black";
        myBike.gear = 0;
        myBike.speed = 0;
        myBike.petrolCapacity = 14;
        System.out.println("My Bike color: "+ myBike.color);
        System.out.println("My Bike gear: "+ myBike.gear);
        System.out.println("My Bike speed: "+ myBike.speed);
        System.out.println("My Bike Petrol Capacity: "+ myBike.petrolCapacity);

        myBike.applyGear();
        System.out.println("My Bike gear: "+ myBike.gear);
        myBike.applySpeed();
        System.out.println("My Bike speed: "+ myBike.speed);
        myBike.brake();
        System.out.println("My Bike gear: "+ myBike.gear);
        System.out.println("My Bike speed: "+ myBike.speed);
    }
    private static void frndBike(Bike friendBike){
        friendBike.color = "White";
        friendBike.gear = 1;
        friendBike.speed = 20;
        friendBike.petrolCapacity = 18;
        System.out.println("Friend color: "+ friendBike.color);
        System.out.println("Friend gear: "+ friendBike.gear);
        System.out.println("Friend speed: "+ friendBike.speed);
        System.out.println("Friend Petrol Capacity: "+ friendBike.petrolCapacity);

        friendBike.applyGear();
        System.out.println("Friend gear: "+ friendBike.gear);
        friendBike.applySpeed();
        System.out.println("Friend speed: "+ friendBike.speed);
        friendBike.brake();
        System.out.println("Friend gear: "+ friendBike.gear);
        System.out.println("Friend speed: "+ friendBike.speed);
    }

}
