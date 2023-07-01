package lk.ijse.nh.util;

/*
    @author DanujaV
    @created 7/1/23 - 10:15 AM   
*/

import org.hibernate.SessionFactory;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        return null;    //session factory object
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
