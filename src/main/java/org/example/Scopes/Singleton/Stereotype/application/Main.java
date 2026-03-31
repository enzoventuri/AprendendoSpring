package org.example.Scopes.Singleton.Stereotype.application;

import org.example.Scopes.Singleton.Stereotype.config.ProjectConfig;
import org.example.Scopes.Singleton.Stereotype.service.CommentService;
import org.example.Scopes.Singleton.Stereotype.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        UserService userService = context.getBean(UserService.class);

        System.out.println(commentService.getCommentRepository() == userService.getCommentRepository());
    }
}
