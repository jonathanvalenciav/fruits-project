package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.Product;
import com.caribbeanexotic.fruits.persistence.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toProduct(ProductEntity product);
    List<Product> toProducts(List<ProductEntity> products);

    ProductEntity toProductEntity(Product product);
    List<ProductEntity> toProductsEntity(List<Product> products);
}
