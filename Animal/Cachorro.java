package Animal;

public class Cachorro extends Animal {
    private String nome;
    private String raca;
    private String idade;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void latir(){
        System.out.println("auau");
    }
    
    
}
