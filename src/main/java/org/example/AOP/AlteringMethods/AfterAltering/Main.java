package org.example.AOP.AlteringMethods.AfterAltering;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        ClienteService clienteService = context.getBean(ClienteService.class);

        Cliente cliente = new Cliente("Enzo", "12345678900");

        String value = clienteService.salvarCliente(cliente);

        log.info(value);
    }
}
