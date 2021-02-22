package com.caribbeanexotic.fruits.web.controller;

import com.caribbeanexotic.fruits.domain.dto.Farm;
import com.caribbeanexotic.fruits.domain.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farms")
public class FarmController {

    @Autowired
    private FarmService farmService;

    @PostMapping("/save")
    public ResponseEntity<Farm> save(@RequestBody Farm farm) {
        return new ResponseEntity<>(farmService.saveFarm(farm), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Farm> update(@RequestBody Farm farm) {
        return new ResponseEntity<>(farmService.updateFarm(farm), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Farm> delete(@RequestBody Farm farm) {
        farmService.deleteFarm(farm);
        return new ResponseEntity<>(HttpStatus.OK);
    }

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
