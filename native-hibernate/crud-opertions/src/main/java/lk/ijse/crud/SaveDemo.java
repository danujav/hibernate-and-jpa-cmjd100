package lk.ijse.crud;

/*
    @author DanujaV
    @created 7/1/23 - 12:13 PM   
*/

import lk.ijse.crud.entity.Item;
import lk.ijse.crud.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SaveDemo {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Item i1 = new Item(4, "Rice", 500);

//            var id = session.save(i1);  //5.x
//            System.out.println("id: " + id);

            session.persist(i1);    //6.x

            transaction.commit();
        }
    }
}
