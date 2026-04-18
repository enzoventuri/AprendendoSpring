package org.example.WiringBeans.AutoWiring.CircularDepedencyWarning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//      Uma dependencia circular é um problema que ocorre quando um objeto para ser criado, precisa de
//      outro objeto e esse tambem precisa do outro, entao quando ele for criado (quando utiliza
//      autowiring), ele da um erro pois nao é possivel ser colocado no contexto spring.
//      ver página 66 para uma explicação mais a fundo.

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Tecnico tecnico = context.getBean(Tecnico.class);

        System.out.println(tecnico.getNome());
        System.out.println(tecnico.getComputador().getMarca());

    }
}
