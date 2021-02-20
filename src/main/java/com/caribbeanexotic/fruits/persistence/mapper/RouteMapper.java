package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.Route;
import com.caribbeanexotic.fruits.persistence.entity.RouteEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RouteMapper {
    Route toRoute(RouteEntity route);
    List<Route> toRoutes(List<RouteEntity> routes);

    RouteEntity toRouteEntity(Route route);
    List<RouteEntity> toRoutesEntity(List<Route> routes);
}
