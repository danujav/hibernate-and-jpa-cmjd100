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

public class UpdateDemo {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Item i1 = session.find(Item.class, 4);
            i1.setDescription("Choco");
            i1.setUnitPrice(1000);

            transaction.commit();
        }
    }
}
