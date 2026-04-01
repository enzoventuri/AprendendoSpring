package org.example.Scopes.Prototype.StereotypeAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Avaliacao avaliacao = new Avaliacao("Enzo", "Avaliação de código top", 5);

        EnviarAvaliacaoDB enviarAvaliacaoDB1 = context.getBean(EnviarAvaliacaoDB.class);
        EnviarAvaliacaoDB enviarAvaliacaoDB2 = context.getBean(EnviarAvaliacaoDB.class);

        enviarAvaliacaoDB1.salvar(avaliacao);
        enviarAvaliacaoDB2.salvar(avaliacao);

        boolean isEqual = enviarAvaliacaoDB1 == enviarAvaliacaoDB2;

        System.out.println("As duas instâncias de enviar avaliação no DB são as mesmas? = " + isEqual);
    }
}
