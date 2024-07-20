import br.com.dio.desafio.dominio.*;

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

        Conteudo conteudo = new Curso();//criar um curso a partir da classe Conteudo (isso se chama polimorfismo)
        Conteudo conteudo1 = new Mentoria();//sendo assim Conteudo eh mae de Mentoria e Curso.

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao Mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJhonny = new Dev();
        devJhonny.setNome("Jhonny");
        devJhonny.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jhonny: " + devJhonny.getConteudosInscritos());//imprimir conteudos inscritos
        devJhonny.progredir();
        devJhonny.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Jhonny: " + devJhonny.getConteudosInscritos());//
        System.out.println("Conteudos Concluidos Jhonny: " + devJhonny.getConteudosConcluidos());//
        System.out.println("XP" + devJhonny.calcularTotalXP());

        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularTotalXP());
    }
}