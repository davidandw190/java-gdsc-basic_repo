package com.example.jspring_gdscbasic.entities;

import java.util.List;

public class Store {
    private List<Product> products;
    private List<User> customers;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<User> getCustomers() {
        return customers;
    }

    public void setCustomers(List<User> customers) {
        this.customers = customers;
    }
}
