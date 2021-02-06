package com.caribbeanexotic.fruits.persistence;

import com.caribbeanexotic.fruits.domain.dto.Role;

import java.util.List;

public interface IRoleRepository {
    List<Role> getAllRoles();
}
