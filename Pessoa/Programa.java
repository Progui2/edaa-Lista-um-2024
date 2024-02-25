package pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Pedro";
        pessoa.idade = 20;
        pessoa.altura = 1.85;
        pessoa.cpf = 123456789;
        pessoa.peso = 70; 
        System.out.println("Meu nome é: " + pessoa.nome + "\nMinha idade é: " + pessoa.idade + " anos" + "\nMeu cpf: " + pessoa.cpf + "\nMinha altura: " + pessoa.altura + "\nMeu peso: " + pessoa.peso + "kg");
    }
    
}
