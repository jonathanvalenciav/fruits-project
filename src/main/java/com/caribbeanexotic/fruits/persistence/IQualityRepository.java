package com.caribbeanexotic.fruits.persistence;

import com.caribbeanexotic.fruits.domain.dto.Quality;

import java.util.List;

public interface IQualityRepository {
    List<Quality> getAllQualities();
}
