package com.example.clubapi.repositories.Seat;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.clubapi.models.Seat;
import java.util.List;

@Repository
public interface ISeatRepo extends MongoRepository<Seat,String>{
    public List<Seat>  findByIsBusy(Boolean busy);
}
