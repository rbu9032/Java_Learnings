package com.java.polymorphism.overload;

import com.java.polymorphism.overriding.Final;

public class PaymentGateway {

    public static void main(String[] args){
        PaymentGateway.pay(611);
        PaymentGateway.pay("Raghu",464516494644745L);
        PaymentGateway.pay(94942022457L);
        PaymentGateway.pay(624631,"eger#554");
        PaymentGateway.pay("My Balance");
    }


    static void pay(int cash){
        System.out.println("Payment done with COD");
    }
    static void pay(String cardName, long cardNo){
        System.out.println("Payment done with Card");
    }
    static void pay(long upiNumber){
        System.out.println("Payment done with UPI");
    }
    static void pay(int customerID, String password){
        System.out.println("Payment done with Net Banking");
    }
    static void pay(String wallet){
        System.out.println("Payment done with Wallet");
    }

}
