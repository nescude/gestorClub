package com.example.clubapi.services;

import com.example.clubapi.mock_interfaces.MockMember;
import com.example.clubapi.models.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service   
public class MemberService {
    
    @Autowired
    MockMember repo;

    public Iterable<Member> getAllMembers(){
        return repo.findAll();
    }

    public Member getByDni(Long dni){
        return repo.findById(dni).orElse(null);
    }

    public Boolean postMember(Member member){
        return repo.save(member) != null;
    }

    public Boolean deleteById(String dni){
        return repo.deleteById(dni);
    }

}
