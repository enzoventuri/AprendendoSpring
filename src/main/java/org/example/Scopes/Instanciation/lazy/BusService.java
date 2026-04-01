package org.example.Scopes.Instanciation.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class BusService {
    private String parada;
    private double kmAteChegada;

    public BusService() {
        System.out.println("INSTÂNCIA CRIADO");
    }
}
