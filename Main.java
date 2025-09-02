package biblioteca;

import biblioteca.model.Categoria;
import biblioteca.model.Livros;
import biblioteca.model.Usuarios;
import biblioteca.service.BibliotecaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BibliotecaService service = new BibliotecaService();

        while(true){
            System.out.println("""
            1 - cadastrar categoria
            2 - cadastrar livro
            3 - cadastrar usuarios
            4 - listar livros
            5 - listar usuarios
            6 - listar categorias
            7 - remover livro
            8 - remover usuarios
            9 - remover categorias
            0 - sair
                    """);
            System.out.println("escolha: ");
            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){
                case 1 -> {
                    System.out.println("nome da categoria: ");
                    String nomecategoria = sc.nextLine();

                    System.out.println("descricao do livro: ");
                    String descricao = sc.nextLine();

                    service.AddCaTegoria(new Categoria(nomecategoria, descricao));
                }
                case 2 -> {
                    System.out.println("nome do livro: ");
                    String nomelivro = sc.nextLine();

                    System.out.println("nome do autor: ");
                    String autor = sc.nextLine();

                    service.AddLivros(new Livros(nomelivro, autor));
                }
                case 3 -> {
                    System.out.println("nome do usuario: ");
                    String nome = sc.nextLine();

                    System.out.println("email: ");
                    String email = sc.nextLine();

                    service.AddUsuario(new Usuarios(nome, email));
                }
                case 4 ->{
                    service.ListarLivros();
                }
                case 5 ->{
                    service.ListarUsuarios();
                }
                case 6 ->{
                    service.ListarCategoria();
                }
                case 7 ->{
                    System.out.println("digite o titulo do livro que deseja remover:");
                    String RemoverLivro = sc.nextLine();

                    boolean removido = service.RemoverLivros(RemoverLivro);
                    if(removido){
                        System.out.println("livro removido");
                    } else {
                        System.out.println("livro nao encontrado");
                    }
                }
                case 8 ->{
                    System.out.println("digite o nome do usuario que deseja remover: ");
                    String RemoverUsuario = sc.nextLine();

                    boolean removido = service.RemoverUsuario(RemoverUsuario);
                    if(removido){
                        System.out.printf("usuario removido");
                    } else {
                        System.out.println("usuario nao encontrado");
                    }
                }
                case 9 ->{
                    System.out.println("digite o nome da categoria que deseja remover: ");
                    String RemoverCategoria = sc.nextLine();

                    boolean removido = service.RemoverCategoria(RemoverCategoria);
                    if (removido){
                        System.out.println("categoria removida");
                    } else {
                        System.out.println("categoria nao encontrada");
                    }
                }
                case 0 ->{
                    System.out.println("adeus");
                    return;
                }
                default -> System.out.println("opcao invalida");
            }
        }
    }
}