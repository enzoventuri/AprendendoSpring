package org.example.WiringBeans.AutoWiring.ConstrutorWiring;

import org.example.WiringBeans.AutoWiring.ConstrutorWiring.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Tecnico tecnico = context.getBean(Tecnico.class);

        System.out.println(tecnico.getNome());
        System.out.println(tecnico.getComputador().getMarca());

    }
}
