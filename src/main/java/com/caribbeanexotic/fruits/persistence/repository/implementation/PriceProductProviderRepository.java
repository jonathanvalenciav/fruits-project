package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.domain.dto.Contact;
import com.caribbeanexotic.fruits.domain.dto.PriceProductProvider;
import com.caribbeanexotic.fruits.domain.dto.Product;
import com.caribbeanexotic.fruits.persistence.IPriceProductProviderRepository;
import com.caribbeanexotic.fruits.persistence.entity.ContactEntity;
import com.caribbeanexotic.fruits.persistence.entity.ProductEntity;
import com.caribbeanexotic.fruits.persistence.mapper.ContactMapper;
import com.caribbeanexotic.fruits.persistence.mapper.PriceProductProviderMapper;
import com.caribbeanexotic.fruits.persistence.mapper.ProductMapper;
import com.caribbeanexotic.fruits.persistence.repository.PriceProductProviderCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PriceProductProviderRepository implements IPriceProductProviderRepository {

    @Autowired
    PriceProductProviderCrudRepository priceProductProviderCrudRepository;

    @Autowired
    PriceProductProviderMapper priceProductProviderMapper;

    @Autowired
    ProductMapper productMapper;

    @Autowired
    ContactMapper contactMapper;

    @Override
    public List<PriceProductProvider> getPricesByProduct(Product product) {
        return priceProductProviderMapper.toPricesProductsProviders(
                priceProductProviderCrudRepository.findByProduct(productMapper.toProductEntity(product)));
    }

    @Override
    public List<PriceProductProvider> getPricesByProvider(Contact provider){
        return priceProductProviderMapper.toPricesProductsProviders(
                priceProductProviderCrudRepository.findByProvider(contactMapper.toContactEntity(provider)));
    }

    @Override
    public PriceProductProvider getPricesByProductAndProvider(Product product, Contact provider){
        ContactEntity providerEntity = contactMapper.toContactEntity(provider);
        ProductEntity productEntity = productMapper.toProductEntity(product);

        return priceProductProviderMapper
                .toPriceProductProvider( priceProductProviderCrudRepository
                        .findByProductAndProvider(productEntity, providerEntity)
                );
    }
}
