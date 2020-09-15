import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos){
        this.nome = nome;
        this.alunos=alunos;
    }

    public int getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }
}

class Test{
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python",200));
        cursos.add(new Curso("JavaScript",155));
        cursos.add(new Curso("Java",300));
        cursos.add(new Curso("Ruby",100));

//        cursos.stream().filter(c -> c.getAlunos() >100 )
//                .forEach(s-> System.out.println( s.getNome()));
        cursos.stream().filter(c -> c.getAlunos() >100 ).map(Curso::getNome)
                .forEach(System.out::println);

        //get first element bigger then 100
        cursos.stream().filter(c-> c.getAlunos() > 100 )
                .findFirst()
                .map(Curso::getNome).ifPresent(c->System.out.println(c));

        //get average
        cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average()
                .ifPresent(System.out::println);

        //convert Stream<Curso> To List<Curso>
        cursos.stream().filter(c -> c.getAlunos() >100 )
                .collect(Collectors.toList());
    }

}
