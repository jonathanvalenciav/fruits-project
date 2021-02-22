package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.PIDetail;
import com.caribbeanexotic.fruits.persistence.entity.PIDetailEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PIDetailMapper {

    PIDetail toPIDetail(PIDetailEntity PIDetail);
    List<PIDetail> toPIDetails(List<PIDetailEntity> PIDetails);

    PIDetailEntity toPIDetailEntity(PIDetail PIDetail);
    List<PIDetailEntity> toPIDetailsEntity(List<PIDetail> PIDetails);
}
