package com.caribbeanexotic.fruits.persistence;


import com.caribbeanexotic.fruits.domain.dto.Route;
import com.caribbeanexotic.fruits.persistence.entity.RouteEntity;

import java.util.List;
import java.util.Optional;

public interface IRouteRepository {
    List<Route> getAllRoutes();
    Optional<Route> getRouteById(Integer id);
    Route saveRoute(RouteEntity route);
    Route updateRoute(RouteEntity route);
    void deleteRoute(RouteEntity route);
}
