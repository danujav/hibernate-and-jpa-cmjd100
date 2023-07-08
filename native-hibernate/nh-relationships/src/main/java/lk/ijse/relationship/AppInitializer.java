package lk.ijse.relationship;

/*
    @author DanujaV
    @created 7/8/23 - 2:56 PM   
*/

import lk.ijse.relationship.util.HibernateUtil;
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
