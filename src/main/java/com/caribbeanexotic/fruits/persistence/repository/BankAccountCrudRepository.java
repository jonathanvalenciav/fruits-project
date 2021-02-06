package com.caribbeanexotic.fruits.persistence.repository;

import com.caribbeanexotic.fruits.persistence.entity.BankAccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountCrudRepository extends CrudRepository<BankAccountEntity,Integer> {
}
