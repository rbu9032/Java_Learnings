package io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
        //System.out.println("Context Loaded");
        Student st = container.getBean("st", Student.class);
        System.out.println(st);
        Student st1 = container.getBean("st", Student.class);
        System.out.println(st==st1);
        Student st2 = container.getBean("st", Student.class);
        System.out.println(st1==st2);
        System.out.println(st1);
        System.out.println(st2);
    }
}
