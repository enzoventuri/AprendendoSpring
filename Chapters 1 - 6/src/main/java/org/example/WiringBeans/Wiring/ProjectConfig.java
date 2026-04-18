package org.example.WiringBeans.Wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class  ProjectConfig {
//    Para Wiring voce chama diretamente o metodo que instancia a classe que
//    voce queira ter a relacao, vale ressaltar que o Spring nao vai instanciar
//    mais um objeto quando voce chama o produto(), ele simplesmente retorna o objeto
//    do contexto Spring

    @Bean("nome")
    @Primary
    public Pessoa pessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Enzo");
        pessoa.setProduto(produto());
        // AQUI ^^

        return pessoa;
    }

    @Bean
    public Produto produto() {
        Produto produto = new Produto();
        produto.setNome("Ouro");

        return produto;
    }

    @Bean
    public Produto produto123() {
        Produto produto = new Produto();
        produto.setNome("Ferro");

        return produto;
    }

    @Bean(name = "MethodTest")
    public Pessoa pessoa2(Produto produto123) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Teste");
        pessoa.setProduto(produto123);

        return pessoa;
    }

//    Quando usa DI (Dependency Injection) para receber como parametro, pode utilizar @Primary
//    no metodo relacional para que ele nao va para outro tipo igual

}
