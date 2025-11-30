package org.hirbernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.model.Passport;
import org.model.User;
import org.util.HibernateUtil;

public class OneToOneMapping {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //insert(session);
        //select(session);
        //delete(session);
        //selectWithBiDirectional(session);
    }

    private static void selectWithBiDirectional(Session session) {
        Passport passport = session.find(Passport.class, 14451);
        System.out.println(passport);
        System.out.println(passport.getUser());
    }

    private static void delete(Session session) {
        session.beginTransaction();
        session.remove(new User(3,"",new Passport(14451,"")));
        session.getTransaction().commit();
    }

    private static void select(Session session) {
        User user = session.find(User.class, 2);
        System.out.println(user);
    }

    private static void insert(Session session) {
        session.beginTransaction();
        User user = new User("Rehman");
        Passport passport = new Passport(15512, "Tirupati");
        //User user = new User("Ramu", new Passport(14451, "Kadapa"));
       // session.persist(user);
        user.setPassport(passport);
        passport.setUser(user);
        session.persist(passport);
        session.getTransaction().commit();
        session.close();
    }
}
