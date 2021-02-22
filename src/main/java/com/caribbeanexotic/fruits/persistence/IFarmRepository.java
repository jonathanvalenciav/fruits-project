package com.caribbeanexotic.fruits.persistence;

import com.caribbeanexotic.fruits.domain.dto.Farm;
import com.caribbeanexotic.fruits.persistence.entity.FarmEntity;

import java.util.List;
import java.util.Optional;

public interface IFarmRepository {
    Farm saveFarm(FarmEntity farm);
    Farm updateFarm(FarmEntity farm);
    void deleteFarm(FarmEntity farm);
    List<Farm> getAllFarms();
    Optional<Farm> getFarmById(Integer id);
}
