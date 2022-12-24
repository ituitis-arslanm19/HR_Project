package com.hrProject.HR.Project.model;

import com.hrProject.HR.Project.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity(name="employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="EMPLOYEE_ID")
    private  String id;

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
}
