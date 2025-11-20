package com.java.enumerator;

public class EnumTest {

    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        System.out.println(monday);
        StatusCodes statusCodes = StatusCodes.SUCCESS;
        System.out.println(statusCodes.getCode());
    }
}
