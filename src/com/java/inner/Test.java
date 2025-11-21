package com.java.inner;

public class Test {

    public static void main(String[] args) {
       Bike bike = new Bike();
       bike.start();
       bike.stop();
       bike.drive();

        Vehicle lorry = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Lorry started");
            }

            @Override
            public void stop() {
                System.out.println("Lorry stopped");
            }
        };
        lorry.start();
        lorry.stop();
        lorry.drive();
    }

}
