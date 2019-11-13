package com.example.commentsapi.repository;

import com.example.commentsapi.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long > {

    @Query("FROM Comment c where c.userid = ?1")
    public Iterable<Comment> findCommentsbyUserId(Long userId);
}
