package com.caribbeanexotic.fruits.domain.service;

import com.caribbeanexotic.fruits.domain.dto.auth.UserApp;
import com.caribbeanexotic.fruits.persistence.mapper.UserMapper;
import com.caribbeanexotic.fruits.persistence.repository.implementation.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return  bCryptPasswordEncoder;
    }

    public UserApp saveUser(UserApp user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.saveUser(userMapper.toUserEntity(user));
    }

}
