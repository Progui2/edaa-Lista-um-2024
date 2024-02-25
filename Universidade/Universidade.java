package Universidade;

public class Universidade {
    private String nome;
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;
    private String CNPJ;

    public Universidade(String nome, String rua ){
        this.nome = nome;
        this.rua = rua;
    }

    public String Getnome() {
        return nome;
    }

    public String mudarRua(String novaRua) {
        rua = novaRua;
        return rua;
    }
}
