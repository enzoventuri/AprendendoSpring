package org.example.WiringBeans.AutoWiring.QualifierAnnotation.WiringVersion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Tecnico tecnico = context.getBean(Tecnico.class);

        System.out.println("Nome do técnico: " + tecnico.getNome());
        System.out.println("Marca do computador que o técnico vai arrumar: "
                + tecnico.getComputador().getMarca());
    }
}
