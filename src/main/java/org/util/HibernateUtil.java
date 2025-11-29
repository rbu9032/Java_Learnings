package org.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.model.Employee;
import org.model.Student;

public class HibernateUtil {

    private static SessionFactory sessionFactory = null;
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            //configuration.addAnnotatedClass(Employee.class);
            configuration.addAnnotatedClass(Student.class);
             sessionFactory = configuration.buildSessionFactory();
           return sessionFactory;
        }
        return sessionFactory;
    }
}
