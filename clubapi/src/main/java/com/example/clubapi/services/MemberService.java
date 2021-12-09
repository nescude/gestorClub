package com.example.clubapi.Services;

import com.example.clubapi.mock_interfaces.MockMember;
import com.example.clubapi.mock_interfaces.MockSeat;
import com.example.clubapi.models.Member;
import com.example.clubapi.models.Seat;
import com.example.clubapi.repositories.Member.MemberRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service   
public class MemberService {
    
    @Autowired
    MemberRepo repo;

    @Autowired
    MockSeat service;

    public Iterable<Member> getAllMembers(){
        return repo.getAllMembers();
    }

    public Member getByDni(String dni){
        return repo.findById(dni);
    }

    public Boolean postMember(Member member){
        return repo.save(member) != null;
    }

    public Boolean deleteMember(String dni){
        return repo.deleteById(dni);
    }

    public Seat getClaimedSeat(String dni){
        return service.findByMemberId();
    }

    public Iterable<Member> getActiveMembers(){
        return repo.getAllActiveMembers();
    }

    public Iterable<Member> getPremiumMembers(){
        return null;
    }

    public Iterable<Member> getLifeMembers(){
        return null;
    }

}
