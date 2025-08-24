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

                    service.AddCategoria(new Categoria(nomecategoria, descricao));
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
                case 0 ->{
                    System.out.println("adeus");
                    return;
                }
                default -> System.out.println("opcao invalida");
            }
        }
    }
}
