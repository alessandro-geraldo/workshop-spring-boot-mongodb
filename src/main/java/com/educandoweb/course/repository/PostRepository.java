package com.educandoweb.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.educandoweb.course.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
