package biblioteca.model;

public class Usuarios {
    private String nome;
    private String email;
    public Usuarios(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + " - " + email;
    }
}
