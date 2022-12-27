package com.hrProject.HR.Project.Service;

import com.hrProject.HR.Project.model.Department;
import com.hrProject.HR.Project.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department createDepartment(Department department){
        return this.departmentRepository.save(department);
    }

    public Department getDepartmentById(Integer id){
        return this.departmentRepository.findById(id).get();
    }
}
