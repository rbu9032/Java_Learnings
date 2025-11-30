package org.hirbernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.model.Course;
import org.model.Trainee;
import org.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class ManyToManyMapping {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //insertion(session);
        Trainee trainee = session.find(Trainee.class, 1);
        System.out.println(trainee);
        System.out.println(trainee.getCourses());
    }

    private static void insertion(Session session) {
        session.beginTransaction();
        List<Trainee> trainees = new ArrayList<>();
        List<Trainee> trainees1 = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<Course> courses1 = new ArrayList<>();
        Trainee t1 = new Trainee("Revanth");
        Trainee t2 = new Trainee("Raghu");
        Trainee t3 = new Trainee("Susmi");
        trainees.add(t1);
        trainees.add(t2);
        trainees1.add(t3);
        Course c1 = new Course("JFS");
        Course c2 = new Course("DevOps");
        Course c3 = new Course("PowerBI");
        courses.add(c1);
        courses.add(c2);
        courses1.add(c3);

        t1.setCourses(courses);
        t2.setCourses(courses);
        t3.setCourses(courses1);

        c1.setTrainees(trainees);
        c2.setTrainees(trainees);
        c3.setTrainees(trainees1);

        session.persist(t1);
        session.persist(t2);
        session.persist(t3);
        session.getTransaction().commit();
        session.close();
    }
}
