package com.example.clubapi.Services;

import com.example.clubapi.models.Seat;

import org.springframework.stereotype.Service;

@Service
public class SeatService {
 /*    @Autowired
    private SeatRepo seatService; */

    public Boolean isBusy(String idSeat){
        //return seatService.isBusy();
    }

    public Iterable<Seat> findByIsBusy(){
        //return seatService.findByIsBusy();
    }
}
