package com.caribbeanexotic.fruits.domain.service;

import com.caribbeanexotic.fruits.domain.dto.PriceProductProvider;
import com.caribbeanexotic.fruits.domain.dto.Product;
import com.caribbeanexotic.fruits.persistence.repository.implementation.PriceProductProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PriceProductProviderService {

    @Autowired
    private PriceProductProviderRepository priceProductProviderRepository;

    @Autowired
    ContactService contactService;

    public List<PriceProductProvider> getPricesProvidersByProduct(Product product) {
        return priceProductProviderRepository.getPricesByProduct(product);
    }

    public List<PriceProductProvider> getPricesProductsByProvider(String identificationNumber) {
        return contactService.getContactByIdentificationNumber(identificationNumber)
                .map(provider -> priceProductProviderRepository.getPricesByProvider(provider))
                .orElse(Collections.emptyList());
    }
}
