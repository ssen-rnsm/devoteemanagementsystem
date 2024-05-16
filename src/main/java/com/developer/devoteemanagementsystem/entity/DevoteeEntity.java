package com.developer.devoteemanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name="devotee_details")
public class DevoteeEntity {
    @Column(name = "name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="devoteeId")
    private long devoteeId;
    @Column(name="email")
    private String email;
    @Column(name = "mobile")
    private String mobile;

    //SadhanaDetailsEntity_sid named foriegn key willa utomatically be formed in my devotee_details table
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_sid") // to make our custom named fk column in devotee details table
    private SadhanaDetailsEntity sadhanaDetailsEntity;

    public DevoteeEntity() {
    }

    public DevoteeEntity(String name, String email, String mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
