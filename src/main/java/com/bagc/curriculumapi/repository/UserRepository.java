package com.bagc.curriculumapi.repository;

import com.bagc.curriculumapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository <User, String> {
    @Query("{ 'id' : ?0 }")
    List<User> findAllByUserId(String id);
}
