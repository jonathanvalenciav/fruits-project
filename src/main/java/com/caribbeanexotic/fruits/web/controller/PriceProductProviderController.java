package com.caribbeanexotic.fruits.web.controller;

import com.caribbeanexotic.fruits.domain.dto.*;
import com.caribbeanexotic.fruits.domain.service.PriceProductProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priceproductprovider")
public class PriceProductProviderController {

    @Autowired
    private PriceProductProviderService priceProductProviderService;

    @GetMapping("/getByProduct")
    public ResponseEntity<List<PriceProductProvider>> getByProduct(@RequestBody Product product) {
        return new ResponseEntity<>(priceProductProviderService.getPricesProvidersByProduct(product), HttpStatus.OK);
    }

    @GetMapping("/getByProvider/{identificationNumberProvider}")
    public ResponseEntity<List<PriceProductProvider>> getByProvider(@PathVariable("identificationNumberProvider") String identificationNumber) {
        return new ResponseEntity<>(priceProductProviderService
                .getPricesProductsByProvider(identificationNumber), HttpStatus.OK);
    }

    @GetMapping("/getByProviderAndProduct/{identificationNumberProvider}")
    public ResponseEntity<PriceProductProvider> getByProviderAndProduct(
            @RequestBody Product product,
            @PathVariable("identificationNumberProvider") String identificationNumber) {

        return new ResponseEntity<>(priceProductProviderService
                .getPricesByProductAndProvider(product, identificationNumber), HttpStatus.OK);
    }
}
