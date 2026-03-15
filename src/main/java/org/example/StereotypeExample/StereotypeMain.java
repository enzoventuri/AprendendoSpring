package org.example.StereotypeExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypeMain {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(StereotypeConfig.class);

        Livro livro = context.getBean(Livro.class);

        System.out.println(livro);
        System.out.println(livro.getNome());
    }
}
