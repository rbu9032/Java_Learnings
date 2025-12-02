package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
//        Student st = container.getBean("student", Student.class);
//        System.out.println(st);
        SimTest simTest = container.getBean("simTest", SimTest.class);
        simTest.callSim();
    }
}
