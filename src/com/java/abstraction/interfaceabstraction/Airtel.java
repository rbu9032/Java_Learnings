package com.java.abstraction.interfaceabstraction;

public class Airtel implements Trai{
    @Override
    public void calling() {
        System.out.println("Call at 1/9s");
    }

    @Override
    public void data() {
    System.out.println("2G");
    }

    @Override
    public void message() {
    System.out.println("50 sms/day");
    }

    @Override
    public void recharge() {
    System.out.println("1GB at 100 ");
    }
}
