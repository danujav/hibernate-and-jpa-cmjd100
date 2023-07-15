package lk.ijse.query;

/*
    @author DanujaV
    @created 7/15/23 - 3:51 PM   
*/

import lk.ijse.query.entity.Customer;
import lk.ijse.query.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HQLDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            String hql = "FROM Customer";   //Customer -> entity
            Query query = session.createQuery(hql);

            List<Customer> customerList = query.list();

            for(Customer customer : customerList) {
                System.out.println(customer);
            }

            transaction.commit();

        }
    }
}
