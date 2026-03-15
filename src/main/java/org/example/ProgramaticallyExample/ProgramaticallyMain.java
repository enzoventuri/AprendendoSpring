package org.example.ProgramaticallyExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class ProgramaticallyMain {
    public static void main(String[] args) {
//      Programatically e utilizado para adicionar condicoes antes de registrar o objeto
//      para o contexto do Spring, como por exemplo colocar somente maquinas que possuem
//      o tipo de "Aviao", segue o exemplo a seguir

        var context = new AnnotationConfigApplicationContext(ProjectConfigProgamatical.class);

        LocalDate hoje = LocalDate.now();

        Maquina maquina = new Maquina("Maquina01", "Motor", hoje);

        Supplier<Maquina> maquinaSupplier = () -> maquina;

        context.registerBean("First", Maquina.class, maquinaSupplier,
                bc -> bc.setPrimary(true));

        Maquina maquina1 = context.getBean(Maquina.class);
        System.out.println(maquina1.getNome());


        Maquina maquina2 = new Maquina("Maquina02", "Aviao", hoje);
        Supplier<Maquina> maquinaSupplier2 = () -> maquina2;

        ArrayList<Maquina> maquinas = new ArrayList<>();
        maquinas.add(maquina2);
        maquinas.add(maquina1);

        for (Maquina m : maquinas) {
            if (m.getTipo().equals("Aviao")) {
                context.registerBean("Aviao", Maquina.class, maquinaSupplier2);
            }
        }
    }

}
