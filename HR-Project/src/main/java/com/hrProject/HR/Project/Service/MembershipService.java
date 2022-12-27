package com.hrProject.HR.Project.Service;

import com.hrProject.HR.Project.model.Company;
import com.hrProject.HR.Project.model.Membership;
import com.hrProject.HR.Project.repository.MembershipRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MembershipService {
    private final MembershipRepository membershipRepository;

    public MembershipService(MembershipRepository membershipRepository) {
        this.membershipRepository = membershipRepository;
    }

    public Membership getMemberShipById(Integer id){
        return this.membershipRepository.findById(id).get();
    }
}
