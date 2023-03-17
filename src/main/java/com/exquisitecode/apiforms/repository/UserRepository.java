package com.exquisitecode.apiforms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.exquisitecode.apiforms.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

		
}
