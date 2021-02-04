package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.persistence.entity.PriceProductProviderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceProductProviderCrudRepository extends CrudRepository<PriceProductProviderEntity,Integer> {
}
