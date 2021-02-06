package com.caribbeanexotic.fruits.persistence.repository;

import com.caribbeanexotic.fruits.persistence.entity.QualityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualityCrudRepository extends CrudRepository<QualityEntity,Integer> {
}
