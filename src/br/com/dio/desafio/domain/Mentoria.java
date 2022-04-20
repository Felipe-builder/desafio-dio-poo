package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private Long id;

    private LocalDate data;

    public Mentoria() {
    }

    public Mentoria(Long id, String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.id = id;
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRDAO + 20d;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "id=" + id +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
