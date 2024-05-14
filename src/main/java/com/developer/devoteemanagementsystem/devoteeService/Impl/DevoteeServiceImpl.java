package com.developer.devoteemanagementsystem.devoteeService.Impl;

import com.developer.devoteemanagementsystem.devoteeService.DevoteeService;
import com.developer.devoteemanagementsystem.entity.DevoteeEntity;
import com.developer.devoteemanagementsystem.repository.DevoteeRepository;
import org.springframework.stereotype.Service;

@Service
public class DevoteeServiceImpl implements DevoteeService {
    private final DevoteeRepository devoteeRepository;

    public DevoteeServiceImpl(DevoteeRepository devoteeRepository) {
        this.devoteeRepository = devoteeRepository;
    }


    @Override
    public DevoteeEntity addDevotee(DevoteeEntity devoteeEntity) {
        return devoteeRepository.save(devoteeEntity);

    }
}
