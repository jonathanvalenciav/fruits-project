package com.caribbeanexotic.fruits.persistence.repository;

import com.caribbeanexotic.fruits.persistence.entity.PIHeaderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PIHeaderCrudRepository extends CrudRepository<PIHeaderEntity,Integer> {
}
