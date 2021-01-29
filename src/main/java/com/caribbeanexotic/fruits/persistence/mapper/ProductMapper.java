package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.Product;
import com.caribbeanexotic.fruits.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
        @Mapping(source = "code", target = "code"),
        @Mapping(source = "description", target = "description"),
    })
    Product toProduct(ProductEntity product);
    List<Product> toProducts(List<ProductEntity> products);

    @InheritInverseConfiguration
    @Mapping(target = "id", ignore = true)
    ProductEntity toProductEntity(Product product);
}
