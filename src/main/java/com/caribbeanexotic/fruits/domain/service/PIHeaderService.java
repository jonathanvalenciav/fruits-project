package com.caribbeanexotic.fruits.domain.service;

import com.caribbeanexotic.fruits.domain.dto.PIHeader;
import com.caribbeanexotic.fruits.persistence.mapper.PIHeaderMapper;
import com.caribbeanexotic.fruits.persistence.repository.implementation.PIHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PIHeaderService {

    @Autowired
    private PIHeaderRepository piHeaderRepository;

    @Autowired
    PIHeaderMapper piHeaderMapper;

    public List<PIHeader> getAllPIs() {
        return piHeaderRepository.getAllPI();
    }

    public Optional<PIHeader> getFarmsById(Integer id) {
        return piHeaderRepository.getPIById(id);
    }

    public PIHeader savePIHeader(PIHeader piHeader) {
        return piHeaderRepository.savePI(piHeaderMapper.toPIHeaderEntity(piHeader));
    }

    public PIHeader updatePIHeader(PIHeader piHeader) {
        return piHeaderRepository.updatePI(piHeaderMapper.toPIHeaderEntity(piHeader));
    }

    public void deletePIHeader(PIHeader piHeader) {
        piHeaderRepository.deletePI(piHeaderMapper.toPIHeaderEntity(piHeader));
    }
}
