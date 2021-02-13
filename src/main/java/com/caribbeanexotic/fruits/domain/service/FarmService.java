package com.caribbeanexotic.fruits.domain.service;

import com.caribbeanexotic.fruits.domain.dto.Farm;
import com.caribbeanexotic.fruits.persistence.repository.implementation.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmService {

    @Autowired
    private FarmRepository farmRepository;

    public List<Farm> getAllFarms() {
        return farmRepository.getAllFarms();
    }

    public Optional<Farm> getFarmsById(Integer id) {
        return farmRepository.getFarmById(id);
    }
}
