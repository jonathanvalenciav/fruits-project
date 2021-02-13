package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.auth.UserApp;
import com.caribbeanexotic.fruits.persistence.entity.auth.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toUserEntity(UserApp user);

    UserApp toUser(UserEntity userEntity);
}
