package tech.ada.poo.base;

import java.util.Scanner;

public class MainBiblioteca {

    public static void main(String[] args) {
        BibliotecaRepositorio repositorio = new BibliotecaRepositorioListImpl();
        BibliotecaService servico = new BibliotecaServiceImpl(repositorio);

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Para capturar a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();

                    Livro livro = new Livro(titulo, autor);
                    servico.cadastrarLivro(livro);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Livros cadastrados:");
                    for (Livro l : repositorio.listarTodos()) {
                        System.out.println("Título: " + l.getTitulo() + ", Autor: " + l.getAutor());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
