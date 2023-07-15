package lk.ijse.query;

/*
    @author DanujaV
    @created 7/15/23 - 3:48 PM   
*/

import lk.ijse.query.entity.Customer;
import lk.ijse.query.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class HQLNameParameterDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {

            /*Customer customer = session.find(Customer.class, "C001");
            System.out.println(customer);*/
            //name parameters
            /*String name = "Supun";
            String hql = "FROM CustomerDetail WHERE name = :cName";

            Query query = session.createQuery(hql);
            query.setParameter("cName", name);

            List<Customer> list = query.list();
            for (Customer customer : list) {
                System.out.println(customer);
            }*/
        }
    }
}
