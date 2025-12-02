package io;

public class Address {

    private int addId;
    private String street;

    public Address() {
    }

    public Address(int addId, String street) {
        this.addId = addId;
        this.street = street;
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addId=" + addId +
                ", street='" + street + '\'' +
                '}';
    }
}
