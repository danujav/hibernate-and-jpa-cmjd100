package lk.ijse.crud;

/*
    @author DanujaV
    @created 7/1/23 - 12:44 PM   
*/

import lk.ijse.crud.entity.Item;
import lk.ijse.crud.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class GetDemo {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Item i1 = session.get(Item.class, 5);
            System.out.println("from get: " + i1);

            Item i2 = session.find(Item.class, 4);
            System.out.println("From find: " + i2);

            transaction.commit();
        }
    }
}
