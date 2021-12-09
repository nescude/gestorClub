package com.example.clubapi.controllers;

import java.util.List;

import com.example.clubapi.models.Member;
import com.example.clubapi.models.Stadium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/club")
public class ClubController {
    
    // @Autowired
    // private ClubService service;

    @RequestMapping("/stadium")
    public Stadium getStadium() {
        // return service.getStadium()
    }

    
}
