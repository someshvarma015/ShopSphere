package com.shopsphere.util;

import com.shopsphere.entity.*;
import jakarta.persistence.criteria.Order;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory() {


        if (sessionFactory == null) {
            Configuration cfg = new Configuration();

            cfg.configure();

            cfg.addAnnotatedClass(Category.class);
            cfg.addAnnotatedClass(Product.class);
            cfg.addAnnotatedClass(User.class);
            cfg.addAnnotatedClass(Address.class);
            cfg.addAnnotatedClass(Orders.class);
            cfg.addAnnotatedClass(OrderItem.class);


            sessionFactory = cfg.buildSessionFactory();
            return sessionFactory;
        }

        else{
            return sessionFactory;
        }

    }
}
