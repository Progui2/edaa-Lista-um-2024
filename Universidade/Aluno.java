package Universidade;

public class Aluno {
    private String nome;
    private int idade;
    private String cpf;

    public Aluno(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;

    }

    public String Getnome(){
        return nome;
    }
}
