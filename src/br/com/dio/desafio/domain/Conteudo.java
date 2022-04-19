package br.com.dio.desafio.domain;

public abstract class Conteudo {

    protected final double XP_PADRDAO = 10d;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public double getXP_PADRDAO() {
        return XP_PADRDAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

