public class Instrutor extends Pessoa {
    private int numeroRegistro;

    public Instrutor(String nome, String email, int numeroRegistro) {
        super(nome, email);
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public void exibirInfo() {
        System.out.println();
        System.out.printf("Instrutor : %s", getNome());
        System.out.printf("%nEmail : %s", getEmail());
        System.out.printf("%nnumero de Registro : %d", numeroRegistro);
        System.out.println();
    }
}
