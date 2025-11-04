
public class Main {
    public static void main(String[] args) {

        Instrutor instrutor1 = new Instrutor("jorge", "jorge@gmail.com", 001);

        Aluno aluno1 = new Aluno("jorge", "jorge1@gmail.com", 10537715);
        Aluno aluno2 = new Aluno("jo", "jo@gmail.com", 10589715);

        Curso curso1 = new Curso("Calculo", instrutor1);

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        
    }   
}
