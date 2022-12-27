package com.hrProject.HR.Project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Membership {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="MEMBERSHIP_ID")
    private  Integer id;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private Integer remainingDays;

    @OneToOne(targetEntity = Company.class, mappedBy = "membership")
    private Company company;
}
