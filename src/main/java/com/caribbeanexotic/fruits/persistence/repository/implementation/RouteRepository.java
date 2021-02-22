package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.domain.dto.Route;
import com.caribbeanexotic.fruits.persistence.IRouteRepository;
import com.caribbeanexotic.fruits.persistence.entity.RouteEntity;
import com.caribbeanexotic.fruits.persistence.mapper.RouteMapper;
import com.caribbeanexotic.fruits.persistence.repository.RouteCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RouteRepository implements IRouteRepository {
    @Autowired
    RouteCrudRepository routeCrudRepository;

    @Autowired
    RouteMapper routeMapper;

    @Override
    public List<Route> getAllRoutes() {
        return routeMapper.toRoutes((List<RouteEntity>) routeCrudRepository.findAll());
    }

    @Override
    public Optional<Route> getRouteById(Integer id) {
        return routeCrudRepository.findById(id).map(route -> routeMapper.toRoute(route));
    }

    @Override
    public Route saveRoute(RouteEntity route) {
        return routeMapper.toRoute(routeCrudRepository.save(route));
    }

    @Override
    public Route updateRoute(RouteEntity route) {
        return routeMapper.toRoute(routeCrudRepository.save(route));
    }

    @Override
    public void deleteRoute(RouteEntity route) {
        routeCrudRepository.delete(route);
    }
}
