package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.PIHeader;
import com.caribbeanexotic.fruits.persistence.entity.PIHeaderEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PIHeaderMapper {
    PIHeader toPIHeader(PIHeaderEntity PIHeader);
    List<PIHeader> toPIHeaders(List<PIHeaderEntity> PIHeaders);

    PIHeaderEntity toPIHeaderEntity(PIHeader PIHeader);
    List<PIHeaderEntity> toPIHeadersEntity(List<PIHeader> PIHeaders);
}
