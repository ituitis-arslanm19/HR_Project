package com.hrProject.HR.Project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="COMPANY_ID")
    private UUID id;

    @Column(name="COMPANY_NAME")
    private String name;
    @Column(name="COMPANY_OFFICIAL_NAME")
    private String officialName;

    @OneToOne
    @JoinColumn(name = "MEMBERSHIP_ID", referencedColumnName = "MEMBERSHIP_ID")
    private Membership membership;

    @OneToMany(targetEntity = Department.class, mappedBy = "company")
    private List<Department> departmentList;

    @OneToMany(targetEntity = Site.class, mappedBy = "company")
    private List<Site> siteList;
}
