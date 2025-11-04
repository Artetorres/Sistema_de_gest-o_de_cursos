import java.util.ArrayList;
import java.util.List;

public class Curso implements Certificavel{
    private String nomeCurso;
    private Instrutor instrutorResponsavel;
    private List<Aluno> alunos;


    public Curso(String nomeCurso, Instrutor instrutorResponsavel) {
        this.nomeCurso = nomeCurso;
        this.instrutorResponsavel = instrutorResponsavel;
        this.alunos = new ArrayList<>();

        this.alunos.add(new Aluno("João", "joaohenpereira@gmail.com", 10737510));
        this.alunos.add(new Aluno("Pedro", "pedro@gmail.com", 10637406));
    }

    public void adicionarAluno(Aluno a) {
        this.alunos.add(a);
    }

    
    public void emitirCertificado(Aluno a) {
        System.out.println("o aluno : " );
    }
}
