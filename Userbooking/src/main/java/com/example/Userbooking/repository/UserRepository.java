package com.example.Userbooking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Userbooking.model.UserModel;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {
	
	UserModel findByusername(String username);

}
