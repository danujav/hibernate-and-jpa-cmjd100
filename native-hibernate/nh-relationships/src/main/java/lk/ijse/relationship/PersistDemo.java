package lk.ijse.relationship;

/*
    @author DanujaV
    @created 7/8/23 - 3:13 PM   
*/

import lk.ijse.relationship.entity.Employee;
import lk.ijse.relationship.entity.embeddeble.Name;
import lk.ijse.relationship.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersistDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Name supun = new Name("Supun", "Chandana", "Perera");
            Employee e1 = new Employee(1, supun, "Panadura");

            session.persist(e1);

            transaction.commit();
        }
    }
}
