package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.domain.dto.Quality;
import com.caribbeanexotic.fruits.persistence.IQualityRepository;
import com.caribbeanexotic.fruits.persistence.entity.QualityEntity;
import com.caribbeanexotic.fruits.persistence.mapper.QualityMapper;
import com.caribbeanexotic.fruits.persistence.repository.QualityCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QualityRepository implements IQualityRepository {
    @Autowired
    QualityCrudRepository qualityCrudRepository;

    @Autowired
    QualityMapper qualityMapper;

    public List<Quality> getAllQualities() {
        return qualityMapper.toQualities((List<QualityEntity>)qualityCrudRepository.findAll());
    }
}
