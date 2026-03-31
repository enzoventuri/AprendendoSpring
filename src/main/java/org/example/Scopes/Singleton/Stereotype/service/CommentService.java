package org.example.Scopes.Singleton.Stereotype.service;

import org.example.Scopes.Singleton.Stereotype.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

}
