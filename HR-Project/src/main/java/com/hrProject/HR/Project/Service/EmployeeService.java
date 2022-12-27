package com.hrProject.HR.Project.Service;

import com.hrProject.HR.Project.enums.Gender;
import com.hrProject.HR.Project.model.Employee;
import com.hrProject.HR.Project.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;
    private DepartmentService departmentService;

    public EmployeeService(EmployeeRepository employeeRepository, DepartmentService departmentService) {
        this.employeeRepository = employeeRepository;
        this.departmentService = departmentService;
    }

    public Employee createEmployee(Employee employee){
        return this.employeeRepository.save(employee);
    }

    public Employee getEmpyloyeeById(Integer id){
        return this.employeeRepository.findById(id).get();
    }
}
