package com.example.clubapi.repositories.Seat;

import java.util.stream.Collectors;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.clubapi.models.Seat;
@Repository
public class SeatRepo {
    
    @Autowired
    ISeatRepo seatRepo;

    public List<Seat> getAllAvailableSeats(){
      
        return seatRepo.findByIsBusy(false);
       // return seatRepo.findAll().stream().filter(seat ->seat.getIsBusy() == false).collect(Collectors.toList());
        
    }
    public Seat findById(String id){
        return seatRepo.findById(id).orElse(null);
    }
    

}
