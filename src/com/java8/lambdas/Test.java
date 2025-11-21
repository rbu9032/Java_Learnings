package com.java8.lambdas;

public class Test {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        Vehicle lorry = () ->{System.out.println("Lorry started");};
        lorry.start();

        Calculator calculator = (a,b) -> {
            //System.out.println("a + b = " + (a+b));
            return a+b;
        };
        int result = calculator.add(10,20);
        System.out.println("a + b = " +result);
    }
}
