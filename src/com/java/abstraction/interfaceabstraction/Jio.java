package com.java.abstraction.interfaceabstraction;

public class Jio implements Trai{

    @Override
    public void calling() {
        System.out.println("Unlimited per day");
    }

    @Override
    public void data() {
        System.out.println("Introduced 4G");
    }

    @Override
    public void message() {
        System.out.println("Unlimited sms/day");
    }

    @Override
    public void recharge() {
        System.out.println("Unlimited calls/sms/data at 159 ");
    }
}
