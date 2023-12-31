package lk.ijse.query;

/*
    @author DanujaV
    @created 7/15/23 - 3:48 PM   
*/

import lk.ijse.query.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AppInitializer {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            System.out.println(session);
        }
    }
}
