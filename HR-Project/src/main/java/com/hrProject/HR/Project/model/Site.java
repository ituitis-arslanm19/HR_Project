package com.hrProject.HR.Project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Site {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="SITE_ID")
    private  Integer id;

    @Column(name="SITE_NAME")
    private String name;

    private Boolean isAntiPassBackActive;

    @ManyToOne
    @JoinColumn(name="COMPANY_ID", referencedColumnName = "COMPANY_ID")
    private Company company;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_site",
            joinColumns = @JoinColumn(name = "SITE_ID", referencedColumnName = "SITE_ID"),
            inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID",
                    referencedColumnName = "EMPLOYEE_ID"))
    private List<Employee> employeeList;
}
