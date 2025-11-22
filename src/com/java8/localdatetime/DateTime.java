package com.java8.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today date:"+today);

        LocalDate dob =LocalDate.of(1999,9,18);
        System.out.println("Storing date: "+dob);
        LocalDate yesterday = LocalDate.parse("2025-02-18");
        System.out.println(yesterday);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow.getDayOfWeek());
        LocalDate yes = today.minusDays(1);
        System.out.println(yes.getDayOfWeek());
        LocalDate preMonth = today.minusMonths(1);
        System.out.println(preMonth.getMonth());

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(today.format(pattern));
        DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(today.format(pattern1));
        System.out.println(LocalDate.of(2025,9,18).format(pattern1));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}
