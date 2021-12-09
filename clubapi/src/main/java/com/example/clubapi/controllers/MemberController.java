package com.example.clubapi.controllers;

import java.util.List;

import com.example.clubapi.models.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
    
    @Autowired
    private MemberService service;

    @GetMapping("/{dni}")
    public Member getByDni(
        @PathVariable String dni) {
        return service.getById(dni);
    }

    @GetMapping("/members")
    public Iterable<Member> getAllMembers() {
        // return service.getAllMembers();
    }

    @PostMapping("/new")
    public Boolean postMember(
        @RequestBody Member member) {
        //return service.postMember(member)
    }

    @DeleteMapping("/delete/{dni}")
    public Boolean deleteMember(
        @PathVariable String dni) {
        // return service.deleteMember(dni)
    }
}
