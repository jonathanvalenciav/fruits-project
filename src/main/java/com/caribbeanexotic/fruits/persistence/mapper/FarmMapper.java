package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.Farm;
import com.caribbeanexotic.fruits.persistence.entity.FarmEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FarmMapper {

    Farm toFarm(FarmEntity farm);
    List<Farm> toFarms(List<FarmEntity> farms);

    FarmEntity toFarmEntity(Farm farm);
    List<FarmEntity> toFarmsEntity(List<Farm> farms);
}
