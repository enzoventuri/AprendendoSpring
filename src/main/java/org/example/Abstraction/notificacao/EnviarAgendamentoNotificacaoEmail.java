package org.example.Abstraction.notificacao;

import org.example.Abstraction.model.Agendamento;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EnviarAgendamentoNotificacaoEmail implements AgendamentoNotificacao {
    @Override
    public void notificar(Agendamento agendamento) {
        System.out.println("\nEMAIL: O seu agendamento de: " + agendamento.getNome()
                + " vai começar em 1 dia");
    }
}
