package lk.ijse.relationship;

/*
    @author DanujaV
    @created 7/8/23 - 2:56 PM   
*/

import lk.ijse.relationship.entity.Owner;
import lk.ijse.relationship.entity.Passenger;
import lk.ijse.relationship.entity.Passport;
import lk.ijse.relationship.entity.Pet;
import lk.ijse.relationship.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToManyDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Owner o1 = new Owner(1, "Saman");

            Pet dog = new Pet(1, "Dog", o1);
            Pet cat = new Pet(2, "Cat", o1);

            o1.getPetList().add(dog);
            o1.getPetList().add(cat);

            session.persist(o1);

            session.persist(dog);
            session.persist(cat);

            /*Owner o2 = new Owner(2, "Srimal");

            Pet dog = new Pet(3, "Parrot", o2);

            o2.getPetList().add(dog);

            session.persist(o2);
            session.persist(dog);*/

            transaction.commit();
        }
    }
}
