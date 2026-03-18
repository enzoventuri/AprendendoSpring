package org.example.WiringBeans;

import org.example.InserirBeansNoContexto.ProgramaticallyExample.ProgramaticallyMain;
import org.example.InserirBeansNoContexto.ProgramaticallyExample.ProjectConfigProgamatical;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Pessoa pessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Enzo");

        return pessoa;
    }

    @Bean
    public Produto produto() {
        Produto produto = new Produto();
        produto.setNome("Ouro");

        return produto;
    }

}
