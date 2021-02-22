package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.City;
import com.caribbeanexotic.fruits.persistence.entity.CityEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {

    City toCity(CityEntity city);
    List<City> toCities(List<CityEntity> cities);

    CityEntity toCityEntity(City city);
    List<CityEntity> toCitiesEntity(List<City> cities);
}
