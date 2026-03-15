package org.example.StereotypeExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypeMain {
    public static void main(String[] args) {
//        O stereotype annotation e bom para digitar menos codigo para colocar uma instancia dentro
//        do contexto da Spring, mas somente e permitido colocar somente um tipo daquela instancia
//        dentro do contexto, e somente apos o framework criar a instancia voce tem controle sob ele
//        va para a pagina 54 do livro para ver mais as diferencas entre @Bean e Stereotype annotation

        var context = new AnnotationConfigApplicationContext(StereotypeConfig.class);

        Livro livro = context.getBean(Livro.class);

        System.out.println(livro);
        System.out.println(livro.getNome());
    }
}
