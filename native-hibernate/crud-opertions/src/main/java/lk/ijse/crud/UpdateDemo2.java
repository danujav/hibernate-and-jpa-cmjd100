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

public class UpdateDemo2 {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

//            session.update(obj);   //deprecated method

            Item i1 = new Item(5, "Rice", 1600);

            Item updatedItem = session.merge(i1);
            System.out.println("updated Item: " + updatedItem);
            transaction.commit();
        }
    }
}
