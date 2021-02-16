package com.caribbeanexotic.fruits.web.controller;

import com.caribbeanexotic.fruits.domain.dto.Product;
import com.caribbeanexotic.fruits.domain.dto.Quality;
import com.caribbeanexotic.fruits.domain.service.ProductService;
import com.caribbeanexotic.fruits.domain.service.QualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/qualities")
public class QualityController {
    @Autowired
    private QualityService qualityService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Quality>> getAll() {
        return new ResponseEntity<>(qualityService.getAllQualities(), HttpStatus.OK);
    }
}
