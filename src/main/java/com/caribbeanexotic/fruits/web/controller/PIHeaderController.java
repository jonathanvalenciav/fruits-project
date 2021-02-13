package com.caribbeanexotic.fruits.web.controller;

import com.caribbeanexotic.fruits.domain.dto.PIHeader;
import com.caribbeanexotic.fruits.domain.service.PIHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/piheader")
public class PIHeaderController {

    @Autowired
    private PIHeaderService piHeaderService;

    @GetMapping("/getAll")
    public ResponseEntity<List<PIHeader>> getAllPI() {
        return new ResponseEntity<>(piHeaderService.getAllPIs(), HttpStatus.OK);
    }

    @GetMapping("/getPIHeaderById/{id}")
    public ResponseEntity<PIHeader> getPIHeaderById(@PathVariable("id") Integer id) {
        return piHeaderService.getHeaderById(id)
                .map(piHeader -> new ResponseEntity<>(piHeader, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/savePIHeader")
    public ResponseEntity<PIHeader> savePIHeader(@RequestBody PIHeader piHeader) {
        return new ResponseEntity<>(piHeaderService.savePIHeader(piHeader), HttpStatus.OK);
    }

    @PutMapping("/updatePIHeader")
    public ResponseEntity<PIHeader> updatePIHeader(@RequestBody PIHeader piHeader) {
        return new ResponseEntity<>(piHeaderService.updatePIHeader(piHeader), HttpStatus.OK);
    }

    @DeleteMapping("/deletePIHeader")
    public ResponseEntity<PIHeader> deletePIHeader(@RequestBody PIHeader piHeader) {
        piHeaderService.deletePIHeader(piHeader);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
