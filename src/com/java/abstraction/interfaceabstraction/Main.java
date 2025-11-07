package com.java.abstraction.interfaceabstraction;

public class Main {

    public static void main(String[] args){
        Airtel ar = new Airtel();
        ar.calling();
        ar.data();
        ar.message();
        ar.recharge();

        Jio jo = new Jio();
        jo.calling();
        jo.data();
        jo.message();
        jo.recharge();
    }
}
