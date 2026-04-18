package org.example.AOP.AlteringMethods.Order;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        UserService userService = context.getBean(UserService.class);

        Usuario usuario = new Usuario("Enzo");

        userService.deleteUser(usuario);
    }
}
