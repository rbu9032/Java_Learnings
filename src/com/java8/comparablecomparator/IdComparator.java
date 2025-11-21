package com.java8.comparablecomparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.empId, o2.empId);
    }
}
