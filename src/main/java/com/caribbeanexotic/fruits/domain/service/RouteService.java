package com.caribbeanexotic.fruits.domain.service;

import com.caribbeanexotic.fruits.domain.dto.PIHeader;
import com.caribbeanexotic.fruits.domain.dto.Route;
import com.caribbeanexotic.fruits.persistence.entity.RouteEntity;
import com.caribbeanexotic.fruits.persistence.mapper.RouteMapper;
import com.caribbeanexotic.fruits.persistence.repository.implementation.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteService {
    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private RouteMapper routeMapper;

    public List<Route> getAllRoutes() {
        return routeRepository.getAllRoutes();
    }

    public Optional<Route> getRouteById(Integer id) {
        return routeRepository.getRouteById(id);
    }

    public Route saveRoute(Route route) {
        return routeRepository.saveRoute(routeMapper.toRouteEntity(route));
    }

    public Route updateRoute(Route route) {
        return routeRepository.updateRoute(routeMapper.toRouteEntity(route));
    }

    public void deleteRoute(Route route) {
        routeRepository.deleteRoute(routeMapper.toRouteEntity(route));
    }
}
