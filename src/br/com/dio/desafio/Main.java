package br.com.dio.desafio;

import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso(1L, "Javascript", "Curso básico de JavaScript", 2.5);
        Curso curso1 = new Curso(2L, "Java", "Curso avançado de JAVA", 3D);
        System.out.println(curso);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria(1L, "Mentoria JavaScript", "Mentória sobre JavaScript e suas principais caracteristicas", LocalDate.now());
        Mentoria mentoria1 = new Mentoria(2L, "Mentoria Java", "Mentória sobre Java e suas principais caracteristicas", LocalDate.now());
        System.out.println(mentoria);
        System.out.println(mentoria1);
    }
}
