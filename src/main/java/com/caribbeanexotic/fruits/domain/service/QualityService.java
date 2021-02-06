package com.caribbeanexotic.fruits.domain.service;

import com.caribbeanexotic.fruits.domain.dto.Quality;
import com.caribbeanexotic.fruits.persistence.repository.implementation.QualityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QualityService {
    @Autowired
    private QualityRepository qualityRepository;

    public List<Quality> getAllQualities() {
        return qualityRepository.getAllQualities();
    }
}
