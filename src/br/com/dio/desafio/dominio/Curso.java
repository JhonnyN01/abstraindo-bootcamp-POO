package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoario;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoario;
    }

    public Curso() {
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoario=" + cargaHoario +
                '}';
    }
}
