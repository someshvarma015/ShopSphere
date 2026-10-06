package com.shopsphere.entity;

import jakarta.persistence.*;

@Table (name="products")
@Entity
public class Product {



    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int productId;

    private String productName;

    private double price;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;


    public Product() {
    }

    public Product( String productName,double price ) {

        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }
}
