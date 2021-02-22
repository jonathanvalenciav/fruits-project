package com.caribbeanexotic.fruits.web.controller;

import com.caribbeanexotic.fruits.domain.dto.Route;
import com.caribbeanexotic.fruits.domain.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Route>> getAll() {
        return new ResponseEntity<>(routeService.getAllRoutes(), HttpStatus.OK);
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<Route> getById(@PathVariable("id") Integer id) {
        return routeService.getRouteById(id)
                .map(route -> new ResponseEntity<>(route, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Route> save(@RequestBody Route route) {
        return new ResponseEntity<>(routeService.saveRoute(route), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Route> update(@RequestBody Route route) {
        return new ResponseEntity<>(routeService.updateRoute(route), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Route> delete(@RequestBody Route route) {
        routeService.deleteRoute(route);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
