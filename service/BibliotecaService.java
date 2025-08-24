package biblioteca.service;

import biblioteca.model.Categoria;
import biblioteca.model.Livros;
import biblioteca.model.Usuarios;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaService {
    private List<Categoria> categoria = new ArrayList<>();
    private List<Livros> livros = new ArrayList<>();
    private List<Usuarios> usuarios = new ArrayList<>();

    public void AddCategoria(Categoria c){
        categoria.add(c);
    }
    public void AddLivros(Livros l){
        livros.add(l);
    }
    public void AddUsuario(Usuarios u){
        usuarios.add(u);
    }
    public void ListarCategoria(){
        if(categoria.isEmpty()){
            System.out.println("nenhuma categoria cadastrada");
        } else {
            for(Categoria c : categoria){
                System.out.println(c);
            }
        }
    }
    public void ListarLivros(){
        if(livros.isEmpty()){
            System.out.println("nenhum livro cadastrado");
        } else {
            for(Livros l : livros){
                System.out.println(l);
            }
        }
    }
    public void ListarUsuarios(){
        if(usuarios.isEmpty()){
            System.out.println("nenhum usuario cadastrado");
        } else {
            for(Usuarios u: usuarios){
                System.out.println(u);
            }
        }
    }
}
