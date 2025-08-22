package biblioteca.model;

public class Categoria {
    private String nome;
    private String descricao;
    public Categoria(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome(){

        return nome;
    }
    public void setNome(){

        this.nome = nome;
    }
    public String getDescricao(){
        return descricao;

    }
    public void setDescricao(){
        this.descricao = descricao;

    }

    @Override
    public String toString() {
        return nome + " - " + descricao;
    }
}
