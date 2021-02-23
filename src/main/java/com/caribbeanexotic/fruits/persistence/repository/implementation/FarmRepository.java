package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.domain.dto.Farm;
import com.caribbeanexotic.fruits.persistence.IFarmRepository;
import com.caribbeanexotic.fruits.persistence.entity.FarmEntity;
import com.caribbeanexotic.fruits.persistence.mapper.FarmMapper;
import com.caribbeanexotic.fruits.persistence.repository.FarmCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FarmRepository implements IFarmRepository {

    @Autowired
    FarmCrudRepository farmCrudRepository;

    @Autowired
    FarmMapper farmMapper;

    @Override
    public Farm saveFarm(FarmEntity farm) {   return farmMapper.toFarm(farmCrudRepository.save(farm));
    }

    @Override
    public Farm updateFarm(FarmEntity farm) {
        return farmMapper.toFarm(farmCrudRepository.save(farm));
    }

    @Override
    public void deleteFarm(FarmEntity farm) {
        farmCrudRepository.delete(farm);
    }

    @Override
    public List<Farm> getAllFarms() {
        return farmMapper.toFarms((List<FarmEntity>)farmCrudRepository.findAll());
    }

    @Override
    public Optional<Farm> getFarmById(Integer id) {
        return farmCrudRepository.findById(id).map(farm -> farmMapper.toFarm(farm));
    }
}
