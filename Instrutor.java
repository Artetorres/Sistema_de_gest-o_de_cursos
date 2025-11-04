public class Instrutor extends Pessoa {
    private int numeroRegistro;

    public Instrutor(String nome, String email, int numeroRegistro) {
        super(nome, email);
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public void exibirInfo() {
        System.out.println();
        System.out.printf("Aluno : %s", getNome());
        System.out.printf("Email : %s", getEmail());
        System.out.printf("numero de Registro : %d", numeroRegistro);
        System.out.println();
    }
}
