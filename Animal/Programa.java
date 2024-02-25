package Animal;

public class Programa {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.setId(1);
        dog.setNome("Todynho");
        dog.setIdade("5 anos");
        System.out.println(dog.getNome());
        dog.latir();
    }
}
