package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.Role;
import com.caribbeanexotic.fruits.persistence.entity.RoleEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    Role toRol(RoleEntity role);
    List<Role> toRoles(List<RoleEntity> roles);

    RoleEntity toRolEntity(Role role);
    List<RoleEntity> toRolesEntity(List<Role> roles);
}
