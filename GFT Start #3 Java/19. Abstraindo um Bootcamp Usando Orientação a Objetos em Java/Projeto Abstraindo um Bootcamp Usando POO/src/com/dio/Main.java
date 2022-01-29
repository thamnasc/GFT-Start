package com.dio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Programação Orientada a Objetos");
        curso1.setDescricao("Aprenda OOP com o professor Tiago na prática. ");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("Collections");
        curso2.setDescricao("Aprenda o Framework Collections com a professora Camila! ");
        curso2.setCargaHoraria(6);

        //polimorfismo
        //Conteudo conteudo = new Curso();
        //Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de OOP");
        mentoria.setDescricao("Abstraia um Bootcamp com a professora Camila!");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("GFT Start #3 Java", "Decole na sua carreira e venha fazer parte desta multinacional alemã!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos Inscritos de Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

        System.out.println("~~~~~~~~~~~~~~");

        Dev devThalita = new Dev();
        devThalita.setNome("Thalita");
        devThalita.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Thalita: " + devThalita.getConteudosInscritos());
        devThalita.progredir();
        System.out.println("Conteúdos Inscritos de Thalita: " + devThalita.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Thalita: " + devThalita.getConteudosConcluidos());
        devThalita.progredir();
        devThalita.progredir();
        System.out.println("Conteúdos Concluídos de Thalita: " + devThalita.getConteudosConcluidos());
        System.out.println("XP: " + devThalita.calcularTotalXp());
        if(devThalita.getConteudosInscritos().isEmpty()) System.out.println("Thalita finalizou o bootcamp!");

    }
}
