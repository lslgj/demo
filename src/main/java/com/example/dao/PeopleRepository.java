package com.example.dao;

import com.example.entity.People;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends MongoRepository<People,String> {

    People findByName(String name);

    @Query("{'age':?0}")
    People withQueryFindByAge(Integer age);

}
