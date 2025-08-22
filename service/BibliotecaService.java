package biblioteca.service;

import biblioteca.model.Livros;
import biblioteca.model.Usuarios;
import biblioteca.model.Categoria;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaService {
    private List<Usuarios> usuarios = new ArrayList<>();
    private List<Livros> livros = new ArrayList<>();
    private List<Categoria> categoria = new ArrayList<>();

    public void AdcUsuario(Usuarios u){
        usuarios.add(u);
    }
    public void AdcCategoria(Categoria c){
        categoria.add(c);
    }
    public void AdcLivros(Livros l){
        livros.add(l);
    }
    public void ListarUsuarios(){
        if(usuarios.isEmpty())
            System.out.println("nenhum usuario cadastratado");

    }
    public void ListarLivros(){
        if(livros.isEmpty())
            System.out.println("nenhum livro cadastrado");
    }
    public void ListarCategoria(){
        if(categoria.isEmpty())
            System.out.println("nenhuma categoria cadastrada");
    }

}

