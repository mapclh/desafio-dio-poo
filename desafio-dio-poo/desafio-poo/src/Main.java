import java.time.LocalDate;

import desafio.Bootcamp;
import desafio.Conteudo;
import desafio.Curso;
import desafio.Dev;
import desafio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java Básico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Curso Java Intermediário");
        curso2.setCargaHoraria(12);

     

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria Java Básico");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarina = new Dev();
        devMarina.setNome("Marina");
        devMarina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marina " + devMarina.getConteudosInscritos());
        devMarina.progredir();
        devMarina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marina " + devMarina.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Marina " + devMarina.getConteudosConcluidos());
        System.out.println("XP: " + devMarina.calcularTotalXp());
        
        System.out.println("----------");

        Dev devNathalia = new Dev();
        devNathalia.setNome("Nathalia");
        devNathalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nathalia " + devNathalia.getConteudosInscritos());
        devNathalia.progredir();
        devNathalia.progredir();
        devNathalia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Nathalia " + devNathalia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Nathalia " + devNathalia.getConteudosConcluidos());
        System.out.println("XP: " + devNathalia.calcularTotalXp());



    

        
    }
}
