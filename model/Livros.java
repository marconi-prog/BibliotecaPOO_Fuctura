package biblioteca.model;

public class Livros {
    private String livro;
    private String autor;

    public Livros(String livro, String autor){
        this.livro = livro;
        this.autor = autor;
    }
    public String getLivro(){

        return livro;
    }
    public void setLivro(String livro){

        this.livro = livro;
    }
    public String getAutor(){
        return  autor;
    }
    public void setAutor(String autor){
        this.autor = autor;

    }

    @Override
    public String toString() {
        return livro + " - " + autor;
    }
}
