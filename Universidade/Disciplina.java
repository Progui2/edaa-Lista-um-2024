package Universidade;

import java.text.MessageFormat;

public class Disciplina {
    private String nome;
    private String prova;
    private double presencaDiaria;
    private Aluno aluno;

    public void lancarPresencaDiariaAluno(int qtdeAulaVista, Aluno aluno){
        presencaDiaria = qtdeAulaVista;
        System.out.println(MessageFormat.format("Aluno(a) {0} presente em aula", aluno.Getnome()));
    }
 
    
}
