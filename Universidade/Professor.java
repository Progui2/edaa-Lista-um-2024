package Universidade;

public class Professor {
    private String nome;
    private String formacao;
    private String cpf;
    private int idade;

    public Professor (String nome, int idade, String cpf, String formacao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.formacao = formacao;
    }

    public String Getnome(){
        return nome;
    }

    
}
