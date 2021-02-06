package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.domain.dto.auth.UserApp;
import com.caribbeanexotic.fruits.persistence.IUserRepository;
import com.caribbeanexotic.fruits.persistence.entity.auth.UserEntity;
import com.caribbeanexotic.fruits.persistence.mapper.UserMapper;
import com.caribbeanexotic.fruits.persistence.repository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {
    @Autowired
    UserCrudRepository userCrudRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public UserApp saveUser(UserEntity userEntity) {
        return userMapper.toUser(userCrudRepository.save(userEntity));
    }

    @Override
    public UserApp getUserByUserName(String username) {
        return userMapper.toUser(userCrudRepository.findByUsername(username));
    }
}
