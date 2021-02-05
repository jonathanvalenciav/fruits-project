package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.Quality;
import com.caribbeanexotic.fruits.persistence.entity.QualityEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QualityMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "code", target = "code"),
            @Mapping(source = "description", target = "description"),
    })
    Quality toQuality(QualityEntity quality);
    List<Quality> toQualities(List<QualityEntity> qualities);

    @InheritInverseConfiguration
    QualityEntity toQualityEntity(Quality quality);
}
