package com.caribbeanexotic.fruits.web.controller;

import com.caribbeanexotic.fruits.domain.dto.Farm;
import com.caribbeanexotic.fruits.domain.dto.Product;
import com.caribbeanexotic.fruits.domain.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/farms")
public class FarmController {

    @Autowired
    private FarmService farmService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Farm>> getAll() {
        return new ResponseEntity<>(farmService.getAllFarms(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Farm> getById(@PathVariable("id") Integer id) {
        return farmService.getFarmById(id)
                .map(farm -> new ResponseEntity<>(farm, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
