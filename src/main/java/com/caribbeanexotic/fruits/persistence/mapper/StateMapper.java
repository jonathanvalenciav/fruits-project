package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.State;
import com.caribbeanexotic.fruits.persistence.entity.StateEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StateMapper {

    State toState(StateEntity state);
    List<State> toStates(List<StateEntity> states);

    StateEntity toStateEntity(State state);
    List<StateEntity> toStatesEntity(List<State> states);
}
