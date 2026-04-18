package org.example.Abstraction.application;

import org.example.Abstraction.model.Agendamento;
import org.example.Abstraction.projectconfig.ProjectConfiguration;
import org.example.Abstraction.service.AgendamentoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Agendamento agendamento = new Agendamento("Barbearia",
                "Cortar cabelo");

        AgendamentoService agendamentoService = context.getBean(AgendamentoService.class);

        agendamentoService.agendar(agendamento);
    }
}
