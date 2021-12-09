package com.example.clubapi.models;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member {
    @Id
    private String dni;
    private String name;
    private String lastname;
    private Boolean active;
    private String plan;
}
