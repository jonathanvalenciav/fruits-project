package com.caribbeanexotic.fruits.persistence.repository;

import com.caribbeanexotic.fruits.persistence.entity.ContactEntity;
import com.caribbeanexotic.fruits.persistence.entity.PriceProductProviderEntity;
import com.caribbeanexotic.fruits.persistence.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceProductProviderCrudRepository extends CrudRepository<PriceProductProviderEntity,Integer> {
    List<PriceProductProviderEntity> findByProduct(ProductEntity product);
    List<PriceProductProviderEntity> findByProvider(ContactEntity provider);
}
