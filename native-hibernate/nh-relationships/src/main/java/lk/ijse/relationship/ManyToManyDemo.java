package lk.ijse.relationship;

/*
    @author DanujaV
    @created 7/8/23 - 2:56 PM   
*/

import lk.ijse.relationship.entity.Lecturer;
import lk.ijse.relationship.entity.Module;
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

            Lecturer l1 = new Lecturer(1, "Sampath");   //prf, orm
            Lecturer l2 = new Lecturer(2, "Sachini");   //dbm, prf

            Module prf = new Module("ITS-001", "Programming Fundamentals");
            Module dbm = new Module("ITS-002", "Database Management Systems");
            Module orm = new Module("ITS-003", "Hibernate");

            //-----
            l1.getModuleList().add(prf);
            l1.getModuleList().add(orm);

            l2.getModuleList().add(dbm);
            l2.getModuleList().add(prf);
            //-----

            //--------
            prf.getLecturerList().add(l1);
            prf.getLecturerList().add(l2);

            dbm.getLecturerList().add(l1);

            orm.getLecturerList().add(l1);
            //------

            session.persist(l1);
            session.persist(l2);
            session.persist(prf);
            session.persist(dbm);
            session.persist(orm);

            transaction.commit();
        }
    }
}
