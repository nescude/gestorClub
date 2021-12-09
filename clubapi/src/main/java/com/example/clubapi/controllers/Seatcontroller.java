package com.example.clubapi.controllers;

import com.example.clubapi.Services.SeatService;
import com.example.clubapi.models.Seat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    private SeatService service;

    @GetMapping("/status")
    public Boolean isBusy(
            @PathVariable String idSeat) {
        // return service.isBusy(idSeat);
    }

    @GetMapping("/avaliableSeats")
    public Iterable<Seat> getAllAvaliableSeats() {
        // return service.getAllAvaliableSeats()
    }

    @PutMapping("/updateSeat")
    public Boolean updateSeatStatus(
            @PathVariable String idSeat) {
        // return service.updateSeatStatus(idSeat)
    }

}
