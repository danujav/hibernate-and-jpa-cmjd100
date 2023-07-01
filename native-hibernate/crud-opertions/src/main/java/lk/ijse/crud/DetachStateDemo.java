package lk.ijse.crud;

/*
    @author DanujaV
    @created 7/1/23 - 1:07 PM   
*/

import lk.ijse.crud.entity.Item;
import lk.ijse.crud.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DetachStateDemo {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Item i1 = session.find(Item.class, 4);
            System.out.println("is i1 is persistence state: " + session.contains(i1));  //true

            session.detach(i1);
            System.out.println("detached here");

            i1.setDescription("Toffee");
            System.out.println("is i1 is persistence state: " + session.contains(i1));  //false

            transaction.commit();
        }
    }
}
