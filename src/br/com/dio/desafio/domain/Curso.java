package br.com.dio.desafio.domain;

public class Curso extends Conteudo {

    private Long id;
    private Double cargaHoraria;

    public Curso() {
    }

    public Curso(Long id, String titulo, String descricao, Double cargaHoraria) {
        this.id = id;
        this.cargaHoraria = cargaHoraria;
        setTitulo(titulo);
        setDescricao(descricao);
    }

    @Override
    public double calcularXp() {
        return XP_PADRDAO * cargaHoraria;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
