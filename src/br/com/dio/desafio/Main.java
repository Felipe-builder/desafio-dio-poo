package br.com.dio.desafio;

import br.com.dio.desafio.domain.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso(1L, "Javascript", "Curso básico de JavaScript", 2.5);
        Curso curso1 = new Curso(2L, "Java", "Curso avançado de JAVA", 3D);
//        System.out.println(curso);
//        System.out.println(curso1);

        Mentoria mentoria = new Mentoria(1L, "Mentoria JavaScript", "Mentória sobre JavaScript e suas principais caracteristicas", LocalDate.now());
        Mentoria mentoria1 = new Mentoria(2L, "Mentoria Java", "Mentória sobre Java e suas principais caracteristicas", LocalDate.now());
//        System.out.println(mentoria);
//        System.out.println(mentoria1);
        Dev camila = new Dev("Camila");
        Dev bernardo = new Dev("Bernardo");
        Bootcamp bootcamp = new Bootcamp(
                "Bootcamp Java Developer",
                "Virem desensolvedor Senior em 5 minutos e receba $10mil por mes",
                new LinkedHashSet<>(Arrays.asList(curso1, curso, mentoria, mentoria1)),
                new HashSet<>(Arrays.asList(camila, bernardo))
        );
        System.out.println("Conteudos Inscritos Camila" + camila.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Bernardo" + camila.getConteudosInscritos());
        camila.inscreverBootcamp(bootcamp);
        bernardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" + camila.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Bernardo" + camila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila" + camila.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos Bernardo" + camila.getConteudosConcluidos());
        camila.progredir();
        bernardo.progredir();
        bernardo.progredir();
        System.out.println("Conteudos Concluidos Camila" + camila.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos Bernardo" + camila.getConteudosConcluidos());

        System.out.println("Camila XP: " + camila.calcularTotalXp());
        System.out.println("Bernardo XP: " + bernardo.calcularTotalXp());
    }
}
