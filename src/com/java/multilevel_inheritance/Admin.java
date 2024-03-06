package com.java.multilevel_inheritance;


public class Admin extends Developer{

    public void manage() {
        super.read();
        write();
        System.out.println("Manage Code");
    }
    public void read() {
        System.out.println("Admin read");
    }

}
