package com.developer.devoteemanagementsystem.repository;

import com.developer.devoteemanagementsystem.entity.SadhanaDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SadhanaDetailsRepository extends JpaRepository<SadhanaDetailsEntity,Long> {

}
