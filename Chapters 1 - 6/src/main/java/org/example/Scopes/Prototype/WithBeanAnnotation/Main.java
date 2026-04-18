package org.example.Scopes.Prototype.WithBeanAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        PlantaCafe plantaCafe1 = context.getBean(PlantaCafe.class);
        PlantaCafe plantaCafe2 = context.getBean(PlantaCafe.class);

        System.out.println(plantaCafe1 == plantaCafe2);

        // Nesse caso vai criar duas instâncias diferentes (não utiliza singleton), utilizar o debugger é uma
        // boa forma de visualizar isso
        // Ir até página 117 - 118 para aprofundar sobre o tema
    }
}
