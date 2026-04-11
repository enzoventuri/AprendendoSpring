package org.example.AOP.AlteringMethods.AfterAltering;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ClienteService {
    private Logger log = Logger.getLogger(ClienteService.class.getName());

    public String salvarCliente(Cliente cliente) {
        log.info("Salvando cliente: " + cliente.getNome());

        return "CLIENTE SALVO COM SUCESSO!";
    }
}
