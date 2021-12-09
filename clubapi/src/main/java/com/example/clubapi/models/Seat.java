package com.example.clubapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Seat {
    private String idSeat;
    private Boolean type;
    private Boolean isBusy;    
}
