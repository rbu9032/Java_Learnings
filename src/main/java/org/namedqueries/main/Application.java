package org.namedqueries.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.namedqueries.model.Student;
import org.util.HibernateUtil;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //select(session);
        update(session);
    }

    private static void update(Session session) {
        session.beginTransaction();
        MutationQuery namedMutationQuery = session.createNamedMutationQuery("updateStudent");
        namedMutationQuery.setParameter(1,92);
        namedMutationQuery.setParameter(2,2);
        namedMutationQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    private static void select(Session session) {
        Query<Student> allStudents = session.createNamedQuery("allStudents", Student.class);
        List<Student> list = allStudents.list();
        System.out.println(list);
    }
}
