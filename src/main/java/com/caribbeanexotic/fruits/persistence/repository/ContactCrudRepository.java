package com.caribbeanexotic.fruits.persistence.repository;

import com.caribbeanexotic.fruits.persistence.entity.ContactEntity;
import com.caribbeanexotic.fruits.persistence.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactCrudRepository extends CrudRepository<ContactEntity,Integer> {
    Optional<ContactEntity> findContactByIdentificationNumber(String identificationNumber);
    List<ContactEntity> findAllByRole(RoleEntity role);
}
