package com.hrProject.HR.Project.Service;

import com.hrProject.HR.Project.model.Company;
import com.hrProject.HR.Project.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final MembershipService membershipService;

    public CompanyService(CompanyRepository companyRepository, MembershipService membershipService) {
        this.companyRepository = companyRepository;
        this.membershipService = membershipService;
    }
}
