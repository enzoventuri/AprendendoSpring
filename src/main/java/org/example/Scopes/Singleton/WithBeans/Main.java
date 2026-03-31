package org.example.Scopes.Singleton.WithBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Filme filme1 = context.getBean(Filme.class);
        Filme filme2 = context.getBean(Filme.class);

        if (filme1 == filme2) {
            System.out.println("Os dois são iguais");
        } else {
            System.err.println("Os dois são diferentes");
        }
    }
}
