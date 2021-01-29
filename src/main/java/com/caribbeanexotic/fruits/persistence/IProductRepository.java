package com.caribbeanexotic.fruits.persistence;

import com.caribbeanexotic.fruits.domain.dto.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();
}
