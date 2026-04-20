package org.example.springboottest.service;

import org.example.springboottest.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    // not good because race conditions can occur
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> findALl() {
        return products;
    }
}


