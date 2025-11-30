package org.nativequery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;
import org.hirbernate.Main;
import org.model.Student;
import org.util.HibernateUtil;

import java.util.List;

public class NativeQueries {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //select(session);
        //insertion(session);
        //selectWithWhere(session);
       // update(session);
        delete(session);


    }

    private static void delete(Session session) {
        session.beginTransaction();
        MutationQuery nativeMutationQuery = session.createNativeMutationQuery("Delete from student where studentId=?1");
        nativeMutationQuery.setParameter(1,5);
        nativeMutationQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    private static void update(Session session) {
        session.beginTransaction();
        MutationQuery nativeMutationQuery = session.createNativeMutationQuery("Update student set marks=?1 where studentId=?2");
        nativeMutationQuery.setParameter(1,98);
        nativeMutationQuery.setParameter(2,3);
        nativeMutationQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    private static void selectWithWhere(Session session) {
        NativeQuery<Student> nativeQuery = session.createNativeQuery("Select * from student where studentId=?1", Student.class);
        nativeQuery.setParameter(1,5);
        List<Student> list = nativeQuery.list();
        System.out.println(list);
    }

    private static void insertion(Session session) {
        session.beginTransaction();
        MutationQuery nativeMutationQuery = session.createNativeMutationQuery("Insert into Student(name, marks) values(?1,?2)");
        nativeMutationQuery.setParameter(1,"Vikram");
        nativeMutationQuery.setParameter(2,67);
        nativeMutationQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    private static void select(Session session) {
        NativeQuery<Student> nativeQuery = session.createNativeQuery("Select * from student", Student.class);
        List<Student> list = nativeQuery.list();
        System.out.println(list);
    }
}
