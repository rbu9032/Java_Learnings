package com.java.multiple_inheritance;

public class User implements Admin{
    @Override
    public void manage() {
        System.out.println("Manage Code");
    }

    @Override
    public void write() {
        System.out.println("Write Only");
    }

    @Override
    public void read() {
        System.out.println("Read Only");
    }
    public static void main(String[] args) {
        User user = new User();
        user.manage();
        user.read();
        user.write();
    }
}
