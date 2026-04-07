package org.example.AOP.AlteringMethods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        ClienteService clienteService = context.getBean(ClienteService.class);

        Cliente cliente = new Cliente("Enzo", "12345678900");

        clienteService.salvarCliente(cliente);
    }
}
