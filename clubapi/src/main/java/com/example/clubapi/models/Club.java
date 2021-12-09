package com.example.clubapi.models;

import java.util.ArrayList;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Club {  
    private String name;
    private ArrayList<Member> members;
}
