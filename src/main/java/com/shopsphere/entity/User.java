package com.shopsphere.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int userId;

    private String userName;

    private String email;

    @OneToOne (cascade = CascadeType.ALL
    )
    @JoinColumn(name ="address_id")
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Orders> orders = new ArrayList<>();
    public User(){

    }

    public User(String userName,String email) {
        this.userName = userName;
        this.email=email;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "User{" +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                "email='" + email + '\'' +'}';
    }
}
