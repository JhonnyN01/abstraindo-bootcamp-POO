import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();//a palavra new sera dela que sera instanciada o objeto.
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoario(8);

        Curso curso2 = new Curso();//a palavra new sera dela que sera instanciada o objeto.
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoario(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao Mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}