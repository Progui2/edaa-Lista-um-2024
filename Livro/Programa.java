public class Programa{
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("O pequeno principe");
        livro.setAssunto("Historia de um pequeno principe");
        livro.setAutor("Antoine");
        livro.setEditora("camelot");
        livro.setISBN("111-11-11-111");
        livro.setQtdepaginas("100 paginas");
        System.out.println("Titulo: " +  livro.getTitulo() + "\nAssunto: " + livro.getAssunto() + "\nAutor: " + livro.getAutor() + "\nISBN: " + livro.getISBN() + "\nQtdepaginas: " + livro.getQtdepaginas());
    
    }
}