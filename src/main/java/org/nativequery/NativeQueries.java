package org.nativequery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;
import org.model.Student;
import org.util.HibernateUtil;

import java.util.List;

public class NativeQueries {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //select(session);
    }

    private static void select(Session session) {
        NativeQuery<Student> nativeQuery = session.createNativeQuery("Select * from student", Student.class);
        List<Student> list = nativeQuery.list();
        System.out.println(list);
    }
}
