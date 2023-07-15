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

            //From
            /*String hql = "FROM Customer";   //Customer -> entity
            Query query = session.createQuery(hql);

            List<Customer> customerList = query.list();

            for(Customer customer : customerList) {
                System.out.println(customer);
            }*/

            // SELECT specified Column
           /* String hql = "SELECT name FROM CustomerDetail"; //name -> prop | CustomerDetail -> Entity
            Query query = session.createQuery(hql);

            List<String> list = query.list();

            for(String name : list) {
                System.out.println(name);
            }*/

            //WHERE clause
            /*String hql = "FROM CustomerDetail WHERE salary >= 20000";
            Query query = session.createQuery(hql);

            List<Customer> list = query.list();
            for(Customer customer : list) {
                System.out.println(customer);
            }*/

            //WHERE with LIKE
            /*String hql = "FROM CustomerDetail WHERE name LIKE 'D%'";
            List<Customer> list = session.createQuery(hql).list();
            for (Customer customer : list) {
                System.out.println(customer);
            }*/

            //ORDER BY Clause
            String hql = "FROM CustomerDetail ORDER BY salary DESC";
            List<Customer> list = session.createQuery(hql).list();
            for (Customer customer : list) {
                System.out.println(customer);
            }

            transaction.commit();

        }
    }
}
