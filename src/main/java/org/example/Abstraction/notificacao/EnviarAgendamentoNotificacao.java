package org.example.Abstraction.notificacao;

import org.example.Abstraction.model.Agendamento;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EnviarAgendamentoNotificacao implements AgendamentoNotificacao {
    @Override
    public void notificar(Agendamento agendamento) {
        System.out.printf("%nURGENTE! %s é daqui 10 minutos!" +
                " Descrição: %s", agendamento.getNome(), agendamento.getDescricao());
    }
}
