package com.java8.comparablecomparator;

import java.util.*;

public class Test {

    public static void main(String[] args) {
/*        List<Student> list = new ArrayList<Student>(List.of(new Student(2, "QQQ"),
                                                            new Student(24, "HHH"),
                                                            new Student(12, "RRR"),
                                                            new Student(4, "XXX")));

        System.out.println(list);
        Collections.sort(list);
        System.out.println("=============================================");
        System.out.println("Sorting using comparable");
        System.out.println(list);
        System.out.println("=============================================");*/
        List<Employee> emp = new ArrayList<Employee>(List.of(new Employee(3,"Java","CCC"),
                new Employee(0,"Python","XXX"), new Employee(23,"SQL","BBB"),
                new Employee(56,"HTML","ZZZ")));
       /* System.out.println(emp);
        Collections.sort(emp, new IdComparator());
        System.out.println("========================================================");
        System.out.println("Id Comparator");
        System.out.println(emp);
        System.out.println("========================================================");
        Collections.sort(emp,new NameComparator());
        System.out.println("Name Comparator");
        System.out.println(emp);*/
       /* Comparator<Employee> domainComparator= new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.domain.compareTo(o2.domain);
            }
        };
        System.out.println("========================================================");
        Collections.sort(emp, domainComparator);
        System.out.println("Domain Comparator using anonymous class");
        System.out.println(emp);

        //Sorting using lambda because Comparator is a functional interface
        Comparator<Employee> lambdaComparator = (emp1, emp2) ->{return Integer.compare(emp1.empId, emp2.empId);};

        System.out.println("========================================================");
        Collections.sort(emp,lambdaComparator);
        System.out.println("Id Comparator using Lambda");
        System.out.println(emp);

        //Sorting using lambda because Comparator is a functional interface reference
        Comparator<Employee> lambdaComparator1 = (emp1, emp2) ->{return emp1.empName.compareTo(emp2.empName);};

        System.out.println("========================================================");
        Collections.sort(emp,lambdaComparator1);
        System.out.println("Name Comparator using Lambda with Comparator reference");
        System.out.println(emp);
        //another approach for sorting by name using lambda without anonymous class
        Collections.sort(emp,(emp1,emp2)->{return emp1.empName.compareTo(emp2.empName);});
        System.out.println("========================================================");
        System.out.println("Name Comparator using Lambda without Comparator reference");
        System.out.println(emp);*/

        /*TreeSet<Employee> empSet = new TreeSet<Employee>(lambdaComparator1);
             empSet.add(new Employee(3,"Java","CCC"));
             empSet.add(new Employee(0,"Python","XXX"));
             empSet.add(new Employee(23,"SQL","BBB"));
             empSet.add(new Employee(56,"HTML","ZZZ"));
        System.out.println("========================================================");
        System.out.println("Employees from TreeSet with Name comparator using lambda");
        System.out.println(empSet);*/

  /*      TreeSet<Employee> empSet = new TreeSet<Employee>((e1, e2)->{return Integer.compare(e1.empId, e2.empId);});
        empSet.add(new Employee(3,"Java","CCC"));
        empSet.add(new Employee(0,"Python","XXX"));
        empSet.add(new Employee(23,"SQL","BBB"));
        empSet.add(new Employee(56,"HTML","ZZZ"));
        System.out.println("========================================================");
        System.out.println("Employees from TreeSet sorted by id using lambda");
        System.out.println(empSet);*/

        System.out.println("========================================================");
        Collections.sort(emp,(e1, e2)->{return e1.domain.compareTo(e2.domain);});
        System.out.println("Employees from list, sorting by domain with lambda");
        System.out.println(emp);
    }
}
