package org.example.Scopes.Instanciation.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Ver vantagens e desvantagens na página 117 para eager e lazy instantiation
        // Bom para usar quando funcionalidades específicas do código não são muito utilizadas
        // Mas isso indica que o app tem defeitos no design (o que é preciso tentar solucionar)
        // Então por isso é muito mais recomendado utilizar eager instantiation

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Contexto inicializado, mas o bean de Bus Service não foi criado pela Spring");

        BusService busService = context.getBean(BusService.class);

        System.out.println("Agora Bus Service foi criado pela Spring " + busService);
    }
}
