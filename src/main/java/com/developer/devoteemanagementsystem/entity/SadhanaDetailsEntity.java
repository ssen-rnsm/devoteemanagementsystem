package com.developer.devoteemanagementsystem.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@Table(name="sadhana_details")
@Transactional
public class SadhanaDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sid")
    private long sid;
    @Column(name = "noOfRounds")
    private int noOfRounds;
    @Column(name = "counselor")
    private String counselor;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "initiationStatus")
    private String initiationStatus;
}
