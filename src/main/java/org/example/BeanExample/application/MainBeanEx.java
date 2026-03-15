package org.example.BeanExample.application;

import org.example.BeanExample.config.ProjectConfigBeanEx;
import org.example.BeanExample.model.Carro;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBeanEx {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigBeanEx.class);

        Carro carro = context.getBean(Carro.class);
        Carro carro2 = context.getBean("Honda", Carro.class);

        System.out.println(carro.getModelo());
        System.out.println(carro2.getModelo());

        String teste = context.getBean(String.class);

        System.out.println(teste);

        Integer numero = context.getBean(Integer.class);

        System.out.println(numero);
    }

}
