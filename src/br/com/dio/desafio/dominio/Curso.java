package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    int cargaHoario;

    public Curso() {
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

    public int getCargaHoario() {
        return cargaHoario;
    }

    public void setCargaHoario(int cargaHoario) {
        this.cargaHoario = cargaHoario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoario=" + cargaHoario +
                '}';
    }
}
