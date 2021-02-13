package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.Quality;
import com.caribbeanexotic.fruits.persistence.entity.QualityEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QualityMapper {
    Quality toQuality(QualityEntity quality);
    List<Quality> toQualities(List<QualityEntity> qualities);

    QualityEntity toQualityEntity(Quality quality);
    List<QualityEntity> toQualitiesEntity(List<Quality> qualities);
}
