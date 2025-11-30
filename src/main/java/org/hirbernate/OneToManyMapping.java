package org.hirbernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.model.Orders;
import org.model.Person;
import org.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class OneToManyMapping {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //insertion(session);
        //select(session);
        //update(session);

    }

    private static void update(Session session) {
        session.beginTransaction();
        Person person = session.find(Person.class, 1);
        person.setName("Shyam");
        List<Orders> orders = person.getOrders();
        Orders orders1 = orders.get(0);
        orders1.setProductName("Xiaomi Redmi");
        session.merge(person);
        session.getTransaction().commit();
        session.close();
    }

    private static void select(Session session) {
        Person person = session.find(Person.class, 1);
        System.out.println(person);
        System.out.println(person.getOrders());
    }

    private static void insertion(Session session) {
        Person shyam = new Person("Shyam", "9865686133");
        Orders redmi = new Orders(1, "Redmi", 1);
        Orders hpLaptop = new Orders(2, "HP Laptop", 1);
        hpLaptop.setPerson(shyam);
        redmi.setPerson(shyam);
        ArrayList<Orders> orders = new ArrayList<>();
        orders.add(redmi);
        orders.add(hpLaptop);
        shyam.setOrders(orders);
        session.beginTransaction();
        session.persist(shyam);
        session.getTransaction().commit();
        session.close();
    }
}
