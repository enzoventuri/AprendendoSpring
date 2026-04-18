package org.example.WiringBeans.Wiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Pessoa pessoa = context.getBean(Pessoa.class);

        System.out.println("Nome da pessoa: " + pessoa.getNome());

        System.out.println(pessoa.getProduto());
    }
}
