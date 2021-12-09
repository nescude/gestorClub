package com.example.clubapi.repositories.Member;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.clubapi.models.Member;

@Repository
public interface IMemberRepo  extends MongoRepository <Member,String>{

    public List<Member>  findByActive(Boolean active);
}
