package com.caribbeanexotic.fruits.domain.service;

import com.caribbeanexotic.fruits.domain.dto.Product;
import com.caribbeanexotic.fruits.persistence.repository.implementation.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
