package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.PriceProductProvider;
import com.caribbeanexotic.fruits.persistence.entity.PriceProductProviderEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PriceProductProviderMapper {
    PriceProductProvider toPriceProductProvider(PriceProductProviderEntity priceProductProvider);
    List<PriceProductProvider> toPricesProductsProviders(List<PriceProductProviderEntity> priceProductProvider);

    PriceProductProviderEntity toPriceProductProviderEntity(PriceProductProvider priceProductProvider);
    List<PriceProductProviderEntity> toPricesProductsProvidersEntity(List<PriceProductProvider> priceProductProvider);
}
