package lk.ijse.relationship;

/*
    @author DanujaV
    @created 7/8/23 - 2:56 PM   
*/

import lk.ijse.relationship.entity.Passenger;
import lk.ijse.relationship.entity.Passport;
import lk.ijse.relationship.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToOneDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Passenger p1 = new Passenger(1, "Siripala");
            Passport pst1 = new Passport("P001", "2022-07-08", p1);

            session.persist(p1);
            session.persist(pst1);

            transaction.commit();
        }
    }
}
