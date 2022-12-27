package com.hrProject.HR.Project.Service;

import com.hrProject.HR.Project.model.Employee;
import com.hrProject.HR.Project.model.Site;
import com.hrProject.HR.Project.repository.SiteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SiteService {
    private final SiteRepository siteRepository;
    private final EmployeeService employeeService;

    public SiteService(SiteRepository siteRepository, EmployeeService employeeService) {
        this.siteRepository = siteRepository;
        this.employeeService = employeeService;
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(this.employeeService.getEmpyloyeeById(1));
        Site site = new Site(null, "testSite",false, null, employeeList);
        this.siteRepository.save(site);
    }
}
