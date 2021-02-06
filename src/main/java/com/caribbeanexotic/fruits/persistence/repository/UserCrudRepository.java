package com.caribbeanexotic.fruits.persistence.repository;

import com.caribbeanexotic.fruits.persistence.entity.auth.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCrudRepository extends CrudRepository<UserEntity,Integer> {
    UserEntity findByUsername(String username);
}
