package org.example.Abstraction.repository;

import org.example.Abstraction.model.Agendamento;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


// @Repository é igual à um @Component, mas explicitamente mostrando que sua função
// é de ser uma Repository (DAO)
@Repository
public class EnviarAgendamentoDB implements AgendamentoRepository {
    @Override
    public void save(Agendamento agendamento) {
        System.out.println("Salvando agendamento no DB... " + agendamento.getNome());
    }
}
