package lk.ijse.relationship.util;

/*
    @author DanujaV
    @created 7/1/23 - 12:04 PM   
*/

import lk.ijse.relationship.entity.*;
import lk.ijse.relationship.entity.Module;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
//                .configure("/hibernate.cfg.xml")
                .loadProperties("/application.properties")
                .build();

        Metadata metadata = new MetadataSources(standardRegistry)
//                .addAnnotatedClass(Employee.class)
                /*.addAnnotatedClass(Passport.class)
                .addAnnotatedClass(Passenger.class)*/
               /* .addAnnotatedClass(Owner.class)
                .addAnnotatedClass(Pet.class)*/
                .addAnnotatedClass(Lecturer.class)
                .addAnnotatedClass(Module.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder()
                .build();

        return sessionFactory;
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
