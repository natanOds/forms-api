package com.exquisitecode.apiforms.repository;

import com.exquisitecode.apiforms.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

		
}
