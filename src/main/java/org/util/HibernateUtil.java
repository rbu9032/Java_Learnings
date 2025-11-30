package org.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.model.*;
import org.namedqueries.model.Student;

public class HibernateUtil {

    private static SessionFactory sessionFactory = null;
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            //configuration.addAnnotatedClass(Employee.class);
            //configuration.addAnnotatedClass(Student.class);
            //configuration.addAnnotatedClass(Student.class);
            //configuration.addAnnotatedClass(Car.class);
//            configuration.addAnnotatedClass(User.class);
//            configuration.addAnnotatedClass(Passport.class);
//            configuration.addAnnotatedClass(Person.class);
//            configuration.addAnnotatedClass(Orders.class);
            configuration.addAnnotatedClass(Trainee.class);
            configuration.addAnnotatedClass(Course.class);
             sessionFactory = configuration.buildSessionFactory();
           return sessionFactory;
        }
        return sessionFactory;
    }
}
