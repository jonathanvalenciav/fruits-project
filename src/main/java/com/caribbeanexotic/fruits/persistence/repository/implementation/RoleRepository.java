package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.domain.dto.Role;
import com.caribbeanexotic.fruits.persistence.IRoleRepository;
import com.caribbeanexotic.fruits.persistence.entity.RoleEntity;
import com.caribbeanexotic.fruits.persistence.mapper.RoleMapper;
import com.caribbeanexotic.fruits.persistence.repository.RoleCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleRepository implements IRoleRepository {
    @Autowired
    RoleCrudRepository roleCrudRepository;

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> getAllRoles() {
        return roleMapper.toRoles((List<RoleEntity>)roleCrudRepository.findAll());
    }
}
