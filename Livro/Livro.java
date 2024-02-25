public class Livro {
    private String titulo;
    private String autor;
    private String assunto; 
    private String qtdepaginas; 
    private String editora;
    private String ISBN;
    
    public String getTitulo() {
       return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getQtdepaginas() {
        return qtdepaginas;
    }

    public void setQtdepaginas(String qtdepaginas) {
        this.qtdepaginas = qtdepaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

}
