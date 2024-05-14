package com.developer.devoteemanagementsystem.devoteeService;

import com.developer.devoteemanagementsystem.entity.DevoteeEntity;
import org.springframework.stereotype.Service;

@Service
public interface DevoteeService {
public DevoteeEntity addDevotee(DevoteeEntity devoteeEntity);
}
