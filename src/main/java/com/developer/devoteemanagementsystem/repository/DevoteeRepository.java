package com.developer.devoteemanagementsystem.repository;

import com.developer.devoteemanagementsystem.entity.DevoteeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevoteeRepository extends JpaRepository<DevoteeEntity,String> {

}
