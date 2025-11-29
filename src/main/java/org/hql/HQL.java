package org.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;
import org.model.Student;
import org.util.HibernateUtil;

import java.util.List;

public class HQL {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
   /*     select(session);
        selectWithWhere(session);
        insertion(session);
        update(session);*/
        delete(session);

    }

    private static void delete(Session session) {
        session.beginTransaction();
        MutationQuery mutationQuery = session.createMutationQuery("Delete from Student where studentId=?1");
        mutationQuery.setParameter(1,4);
        mutationQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    private static void update(Session session) {
        session.beginTransaction();
        MutationQuery mutationQuery = session.createMutationQuery("Update Student set marks=?1 where studentId=?2");
        mutationQuery.setParameter(1,71);
        mutationQuery.setParameter(2,2);
        mutationQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    private static void insertion(Session session) {
        session.beginTransaction();
        MutationQuery mutationQuery = session.createMutationQuery("Insert into Student(name, marks) values(?1,?2)");
        mutationQuery.setParameter(1,"Janu");
        mutationQuery.setParameter(2,74);
        mutationQuery.executeUpdate();
        session.getTransaction().commit();
    }

    private static void selectWithWhere(Session session) {
        SelectionQuery<Student> selectionQuery = session.createSelectionQuery("From Student where studentId=?1", Student.class);
        selectionQuery.setParameter(1,2);
        List<Student> list = selectionQuery.list();
        System.out.println(list);
    }

    private static void select(Session session) {
        // SelectionQuery<Student> selectSFromStudentS = session.createSelectionQuery("Select s from Student s", Student.class);
        SelectionQuery<Student> selectSFromStudentS = session.createSelectionQuery("from Student", Student.class);
        List<Student> list = selectSFromStudentS.list();
        System.out.println(list);
    }
}
