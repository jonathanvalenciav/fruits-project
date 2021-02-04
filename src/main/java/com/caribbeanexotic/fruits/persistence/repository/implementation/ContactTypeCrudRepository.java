package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.persistence.entity.ContactTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactTypeCrudRepository extends CrudRepository<ContactTypeEntity,Integer> {
}
