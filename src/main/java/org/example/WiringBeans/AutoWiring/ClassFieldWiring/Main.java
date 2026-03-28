package org.example.WiringBeans.AutoWiring.ClassFieldWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigAutoWiring.class);

        Pacote pacote = context.getBean(Pacote.class);

        System.out.println("Nome do produto dentro do pacote: " +
                pacote.getProduto().getNome());
    }

}
