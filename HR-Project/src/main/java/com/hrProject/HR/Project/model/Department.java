package com.hrProject.HR.Project.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="DEPARTMENT_ID")
    private  Integer id;
    @OneToMany(targetEntity = Employee.class, mappedBy = "department")
    private List<Employee> employeeList;

    @Column(name="DEPARTMENT_NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")
    private Company company;
}
