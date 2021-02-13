package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.domain.dto.PIHeader;
import com.caribbeanexotic.fruits.persistence.IPIHeaderRepository;
import com.caribbeanexotic.fruits.persistence.entity.PIHeaderEntity;
import com.caribbeanexotic.fruits.persistence.mapper.PIHeaderMapper;
import com.caribbeanexotic.fruits.persistence.repository.PIHeaderCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PIHeaderRepository implements IPIHeaderRepository {

    @Autowired
    PIHeaderCrudRepository piHeaderCrudRepository;

    @Autowired
    PIHeaderMapper piHeaderMapper;

    @Override
    public List<PIHeader> getAllPI() {
        return piHeaderMapper.toPIHeaders((List<PIHeaderEntity>) piHeaderCrudRepository.findAll());
    }

    @Override
    public Optional<PIHeader> getPIById(Integer id) {
        return piHeaderCrudRepository.findById(id).map(PIHeader -> piHeaderMapper.toPIHeader(PIHeader));
    }

    @Override
    public PIHeader savePI(PIHeaderEntity piHeader) {
        return piHeaderMapper.toPIHeader(piHeaderCrudRepository.save(piHeader));
    }

    @Override
    public PIHeader updatePI(PIHeaderEntity piHeader) {
        return piHeaderMapper.toPIHeader(piHeaderCrudRepository.save(piHeader));
    }

    @Override
    public void deletePI(PIHeaderEntity piHeader) {
        piHeaderCrudRepository.delete(piHeader);
    }
}
