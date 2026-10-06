package com.shopsphere.service;

import com.shopsphere.dao.ProductDAO;
import com.shopsphere.entity.Product;
import com.shopsphere.exception.InvalidProductException;

import java.util.List;

public class ProductService {

    private ProductDAO productDAO = new ProductDAO();

    public void saveProduct(Product product) {

        if (product.getPrice() <= 0) {
            throw new InvalidProductException(
                    "Product price must be greater than 0"
            );
        }
        if (product.getProductName() == null ||
                product.getProductName().isEmpty()) {


            throw new InvalidProductException(
              "Product name cannot be empty"
            );
        }

        productDAO.saveProduct(product);
    }

    public Product getProduct(int productId) {
        return productDAO.getProduct(productId);
    }
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }
    public void updateProduct(int productId, String newName, double newPrice) {
        productDAO.updateProduct(productId, newName, newPrice);
    }
    public void deleteProduct(int productId) {
        productDAO.deleteProduct(productId);
    }



}

