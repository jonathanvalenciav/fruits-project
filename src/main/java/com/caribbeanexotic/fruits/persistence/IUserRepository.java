package com.caribbeanexotic.fruits.persistence;


import com.caribbeanexotic.fruits.domain.dto.auth.UserApp;
import com.caribbeanexotic.fruits.persistence.entity.auth.UserEntity;

public interface IUserRepository {
    UserApp saveUser(UserEntity userEntity);
    UserApp getUserByUsername(String username);
}
