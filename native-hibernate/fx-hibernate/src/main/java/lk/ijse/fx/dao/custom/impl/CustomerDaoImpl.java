package lk.ijse.fx.dao.custom.impl;

/*
    @author DanujaV
    @created 7/15/23 - 2:28 PM   
*/

import lk.ijse.fx.dao.custom.CustomerDao;
import lk.ijse.fx.entity.Customer;
import lk.ijse.fx.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDaoImpl implements CustomerDao {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private final Session session = sessionFactory.openSession();
    @Override
    public boolean save(Customer customer) throws Exception {
            Transaction transaction = session.beginTransaction();
            session.persist(customer);

            transaction.commit();
            return true;
    }
}
