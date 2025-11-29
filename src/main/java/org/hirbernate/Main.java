package org.hirbernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.model.Employee;
import org.model.Student;
import org.util.HibernateUtil;


public class Main {
    public static void main(String[] args) {
      /*  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Employee sample = new Employee(2,"Tom");
        session.beginTransaction();
        session.persist(sample);
        session.getTransaction().commit();
        System.out.println("Inserted data");*/
        //getData();
        //updateData();
        //deleteData();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Student student = new Student("Ram",89);
        Student student1 = new Student("Janani",100);
        session.beginTransaction();
        session.persist(student);
        session.persist(student1);
        session.getTransaction().commit();
        session.close();
    }

    public static void getData(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee = session.find(Employee.class, 1);
        System.out.println(employee);
        session.close();
    }

    public static void updateData(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee = session.find(Employee.class, 1);
        /*Employee employee = new Employee();
        employee.setEmpId(1);*/
        employee.setName("Surya");
        session.beginTransaction();
        //session.merge(employee);
        session.getTransaction().commit();
        session.close();
    }
    public static void deleteData(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee = new Employee(2,"","");
        session.beginTransaction();
        session.remove(employee);
        session.getTransaction().commit();
        session.close();
    }
}