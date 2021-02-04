package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.persistence.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleCrudRepository extends CrudRepository<RoleEntity,Integer> {
}
