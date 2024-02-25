package Universidade;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Pedro", 25, "123456789");
        Professor professor =new Professor("Daniel Paiva", 31, "123456789", "Graduação e pós");
        Universidade universidade = new Universidade("UNA", "Rua dos professores");
        Disciplina disciplina = new Disciplina();
        System.out.println("Professor: " + professor.Getnome());
        System.out.println("universidade: " + universidade.Getnome());
        disciplina.lancarPresencaDiariaAluno(3, aluno);
    }
}
