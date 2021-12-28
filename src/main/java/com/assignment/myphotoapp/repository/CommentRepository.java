package com.assignment.myphotoapp.repository;

import com.assignment.myphotoapp.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findAllById(String id);
}
