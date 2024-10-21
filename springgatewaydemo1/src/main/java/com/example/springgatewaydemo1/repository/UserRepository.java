package com.example.springgatewaydemo1.repository;

import com.example.springgatewaydemo1.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {


    User save(User entity);
    List<User> findAll();
}
