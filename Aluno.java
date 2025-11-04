public class Aluno extends Pessoa {

    private int numeroMatricula;

    public Aluno(String nome, String email, int numeroMatricula) {
        super(nome, email);
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println();
        System.out.printf("Aluno : %s", getNome());
        System.out.printf("%nEmail : %s", getEmail());
        System.out.printf("%nnumero de Matricula : %d", numeroMatricula);
        System.out.println();
    }
}
