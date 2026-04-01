package org.example.Scopes.Prototype.StereotypeAnnotation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class EnviarAvaliacaoDB implements AvaliacaoRepository {
    @Override
    public void salvar(Avaliacao avaliacao) {
        System.out.println("Salvando no DB...");
    }
}
