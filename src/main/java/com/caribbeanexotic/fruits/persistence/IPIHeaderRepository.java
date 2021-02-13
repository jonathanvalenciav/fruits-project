package com.caribbeanexotic.fruits.persistence;


import com.caribbeanexotic.fruits.domain.dto.PIHeader;
import com.caribbeanexotic.fruits.persistence.entity.PIHeaderEntity;

import java.util.List;
import java.util.Optional;

public interface IPIHeaderRepository {
    List<PIHeader> getAllPI();
    Optional<PIHeader> getPIById(Integer id);
    PIHeader savePI(PIHeaderEntity piHeader);
    PIHeader updatePI(PIHeaderEntity piHeader);
    void deletePI(PIHeaderEntity piHeader);
}
