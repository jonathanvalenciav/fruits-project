package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.Country;
import com.caribbeanexotic.fruits.persistence.entity.CountryEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    Country toCountry(CountryEntity country);
    List<Country> toCountries(List<CountryEntity> countries);

    CountryEntity toCountryEntity(Country country);
    List<CountryEntity> toCountriesEntity(List<Country> countries);
}
