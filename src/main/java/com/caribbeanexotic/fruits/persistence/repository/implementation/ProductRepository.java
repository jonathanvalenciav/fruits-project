package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.domain.dto.Product;
import com.caribbeanexotic.fruits.persistence.IProductRepository;
import com.caribbeanexotic.fruits.persistence.entity.ProductEntity;
import com.caribbeanexotic.fruits.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    @Autowired
    ProductCrudRepository productCrudRepository;

    @Autowired
    ProductMapper productMapper;

    public List<Product> getAll() {
        return productMapper.toProducts((List<ProductEntity>)productCrudRepository.findAll());
    }
}
