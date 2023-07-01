package lk.ijse.crud;

/*
    @author DanujaV
    @created 7/1/23 - 12:04 PM   
*/

import lk.ijse.crud.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AppInitializer {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession()) {

            System.out.println("session: " + session);



        }
    }
}
