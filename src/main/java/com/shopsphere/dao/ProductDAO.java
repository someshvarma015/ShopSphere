package com.shopsphere.dao;

import com.shopsphere.entity.Product;
import com.shopsphere.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDAO {

    public void saveProduct(Product product){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try{
            session.persist(product);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
        }
        finally {
            session.close();

        }

    }
    public Product getProduct(int productId) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            return session.find(Product.class, productId);

        } finally {

            session.close();
        }
    }

    public List<Product> getAllProducts() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            return session.createQuery(
                    "from Product", Product.class
            ).getResultList();

        } finally {

            session.close();
        }
    }


    public void updateProduct(int productId, String newName, double newPrice) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {

            Product product = session.find(Product.class, productId);

            if (product != null) {
                product.setProductName(newName);
                product.setPrice(newPrice);
            }

            transaction.commit();

        } catch (Exception e) {

            transaction.rollback();
            e.printStackTrace();

        } finally {

            session.close();
        }
    }
    public void deleteProduct(int productId) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {

            Product product = session.find(Product.class, productId);

            if (product != null) {
                session.remove(product);
            }

            transaction.commit();

        } catch (Exception e) {

            transaction.rollback();
            e.printStackTrace();

        } finally {

            session.close();
        }
    }



}
