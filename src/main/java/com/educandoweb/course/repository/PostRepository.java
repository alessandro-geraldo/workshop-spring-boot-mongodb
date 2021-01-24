package com.educandoweb.course.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.educandoweb.course.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
	List<Post> findByTitleContainingIgnoreCase(String text);

}
