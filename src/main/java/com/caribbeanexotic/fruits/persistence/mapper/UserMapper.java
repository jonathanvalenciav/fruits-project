package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.auth.UserApp;
import com.caribbeanexotic.fruits.persistence.entity.auth.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings({
            @Mapping(source = "userName", target = "userName"),
            @Mapping(source = "enabled", target = "enabled"),
            @Mapping(source = "password", target = "password"),
    })
    UserEntity toUserEntity(UserApp user);
    
    @InheritInverseConfiguration 
    UserApp toUser(UserEntity userEntity);
}
