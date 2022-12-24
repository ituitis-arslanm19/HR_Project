package com.hrProject.HR.Project.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  String id;
    @OneToMany(targetEntity = Employee.class, mappedBy = "department")
    private List<Employee> employeeList;
}
