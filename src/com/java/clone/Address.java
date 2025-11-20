package com.java.clone;

public class Address {

    String pincode;

    public Address() {
    }

    public Address(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pincode='" + pincode + '\'' +
                '}';
    }
}
