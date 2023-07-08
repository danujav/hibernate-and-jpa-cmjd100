package lk.ijse.relationship;

/*
    @author DanujaV
    @created 7/8/23 - 2:56 PM   
*/

import lk.ijse.relationship.entity.Owner;
import lk.ijse.relationship.entity.Pet;
import lk.ijse.relationship.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ManyToManyDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            transaction.commit();
        }
    }
}
