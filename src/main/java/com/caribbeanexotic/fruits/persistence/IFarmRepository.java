package com.caribbeanexotic.fruits.persistence;

import com.caribbeanexotic.fruits.domain.dto.Farm;

import java.util.List;
import java.util.Optional;

public interface IFarmRepository {
    List<Farm> getAllFarms();
    Optional<Farm> getFarmById(Integer id);
}
