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

public class SaveDemo2 {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Item i1 = new Item(5, "Sprite", 160); //transient
            System.out.println("Is item is inside the persistence? " + session.contains(i1));   //false ~ is that object is persist or not

            session.persist(i1);    //transient -> persistence state
            System.out.println("save here?");
            System.out.println("Is item is inside the persistence? " + session.contains(i1));   //true

            transaction.commit();
        }
    }
}
