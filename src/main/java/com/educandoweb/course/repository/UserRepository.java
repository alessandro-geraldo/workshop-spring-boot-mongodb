package com.educandoweb.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.educandoweb.course.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
