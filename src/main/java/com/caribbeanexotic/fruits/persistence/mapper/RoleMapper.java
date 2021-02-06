package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.Role;
import com.caribbeanexotic.fruits.persistence.entity.RoleEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "code", target = "code"),
            @Mapping(source = "description", target = "description"),
    })
    Role toRol(RoleEntity role);
    List<Role> toRoles(List<RoleEntity> roles);

    @InheritInverseConfiguration
    RoleEntity toRolEntity(Role role);
}
