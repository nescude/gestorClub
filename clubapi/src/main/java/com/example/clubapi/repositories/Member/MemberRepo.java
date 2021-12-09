package com.example.clubapi.repositories.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.clubapi.models.Member;
import java.util.List;
@Repository
public class MemberRepo {
    
    @Autowired
    IMemberRepo memberRepo;

    public Member findById(String id){
        return memberRepo.findById(id).orElse(null);
    }
public List<Member> getAllActiveMembers(){
    return memberRepo.findByActive(true);
}

public Iterable<Member> getAllMembers(){
    return memberRepo.findAll();
}
}
