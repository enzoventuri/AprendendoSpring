package org.example.Abstraction.service;

import org.example.Abstraction.model.Agendamento;
import org.example.Abstraction.notificacao.AgendamentoNotificacao;
import org.example.Abstraction.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Service é igual à um @Component, mas explicitamente mostrando que sua função
// é de ser uma Service
@Service
public class AgendamentoService {
    private final AgendamentoNotificacao agendamentoNotificacao;
    private final AgendamentoRepository agendamentoRepository;

    @Autowired
    public AgendamentoService(@Qualifier("EMAIL") AgendamentoNotificacao agendamentoNotificacao,
                              AgendamentoRepository agendamentoRepository) {
        this.agendamentoNotificacao = agendamentoNotificacao;
        this.agendamentoRepository = agendamentoRepository;
    }

    public void agendar(Agendamento agendamento) {
        System.out.println("Agendamento feito!");
        agendamentoRepository.save(agendamento);

        try {
            Thread.sleep(5000);
            agendamentoNotificacao.notificar(agendamento);
        } catch (InterruptedException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

}
