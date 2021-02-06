package com.caribbeanexotic.fruits.persistence.repository;

import com.caribbeanexotic.fruits.persistence.entity.BankEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankCrudRepository extends CrudRepository<BankEntity,Integer> {
}
