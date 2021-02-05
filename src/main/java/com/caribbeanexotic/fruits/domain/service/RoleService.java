package com.caribbeanexotic.fruits.domain.service;

import com.caribbeanexotic.fruits.domain.dto.Quality;
import com.caribbeanexotic.fruits.domain.dto.Role;
import com.caribbeanexotic.fruits.persistence.repository.implementation.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.getAllRoles();
    }
}
