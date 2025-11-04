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

    public void adicionarAluno(Aluno aluno) {
        validaEmailAluno(aluno.getEmail());
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno a) {
        this.alunos.remove(a);
    }

    public void emitirCertificado() {
        for(Aluno alunos : alunos) {
            System.out.println("O aluno : " + alunos.getNome() + " ganhou o certificado de " + nomeCurso );
        }
    }

    public void ExibiInfo() {
        System.out.println();
        System.out.println("Curso : " + nomeCurso);
        System.out.println("Instrutor : " + instrutorResponsavel.getNome());
        for(Aluno alunos : alunos) {
            System.out.println("O aluno : " + alunos.getNome());
        }
    }

    public void validaEmailAluno(String email) {
        for (Aluno aluno : alunos) {
            if (email == aluno.getEmail()) {
                  throw new IllegalArgumentException("Aluno já cadastrado");
            }
        }
    }
    public void validarRegistroInstrutor(int registro) {
        
    }
}
