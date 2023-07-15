package lk.ijse.query;

/*
    @author DanujaV
    @created 7/15/23 - 3:48 PM   
*/

import lk.ijse.query.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HQLUpdateDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            //Update clause
            int salaryIncrement = 5000;
            String address = "Panadura";
            String hql = "UPDATE CustomerDetail SET salary = (salary + :data) WHERE address = :cAddress";
           
            Query query = session.createQuery(hql);
            query.setParameter("data", salaryIncrement);
            query.setParameter("cAddress", address);

            int rowCount = query.executeUpdate();
            if(rowCount > 0) {
                System.out.println("huree!!! salary updated!!!");
            } else {
                System.out.println("oops! nothing to update");
            }

            transaction.commit();
        }
    }
}
