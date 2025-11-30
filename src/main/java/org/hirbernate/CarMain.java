package org.hirbernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.model.Car;
import org.model.CarId;
import org.util.HibernateUtil;

public class CarMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //createCompTable(session);
         select(session);
    }

    private static void select(Session session) {
        Car car = session.find(Car.class, new CarId(101, "48648WFN6564878"));
        System.out.println(car);
    }

    private static void createCompTable(Session session) {
        session.beginTransaction();
        Car car = new Car(new CarId(101, "95676SINGI12135"), "Mahindra", 1300000);
        session.persist(car);
        session.getTransaction().commit();
        session.close();
    }
}
