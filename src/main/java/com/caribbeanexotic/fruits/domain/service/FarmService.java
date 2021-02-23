package com.caribbeanexotic.fruits.domain.service;

import com.caribbeanexotic.fruits.domain.dto.Farm;
import com.caribbeanexotic.fruits.persistence.mapper.FarmMapper;
import com.caribbeanexotic.fruits.persistence.repository.implementation.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmService {

    @Autowired
    private FarmRepository farmRepository;

    @Autowired
    private FarmMapper farmMapper;

    public Farm saveFarm(Farm farm) {
        return farmRepository.saveFarm(farmMapper.toFarmEntity(farm));
    }

    public Farm updateFarm(Farm farm) {
        return farmRepository.updateFarm(farmMapper.toFarmEntity(farm));
    }

    public void deleteFarm(Farm farm) {
        farmRepository.deleteFarm(farmMapper.toFarmEntity(farm));
    }

    public List<Farm> getAllFarms() {
        return farmRepository.getAllFarms();
    }

    public Optional<Farm> getFarmById(Integer id) {
        return farmRepository.getFarmById(id);
    }
}
