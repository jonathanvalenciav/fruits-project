package com.caribbeanexotic.fruits.persistence;


import com.caribbeanexotic.fruits.domain.dto.Contact;
import com.caribbeanexotic.fruits.domain.dto.PriceProductProvider;
import com.caribbeanexotic.fruits.domain.dto.Product;

import java.util.List;

public interface IPriceProductProviderRepository {
    List<PriceProductProvider> getPricesByProduct(Product product);
    List<PriceProductProvider> getPricesByProvider(Contact provider);
}
