package com.hrProject.HR.Project.model;

import com.hrProject.HR.Project.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity(name="employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="EMPLOYEE_ID")
    private  Integer id;

    @Column(name="EMPLOYEE_FIRSTNAME")
    private String firstName;

    @Column(name="EMPLOYEE_LASTNAME")
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @ManyToOne
    @JoinColumn(name="DEPARTMENT_ID", referencedColumnName = "DEPARTMENT_ID")
    private Department department;

    @ManyToMany(mappedBy = "employeeList")
    private List<Site> siteList;
}
