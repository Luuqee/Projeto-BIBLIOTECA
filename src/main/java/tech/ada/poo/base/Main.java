package tech.ada.poo.base;

import java.util.Scanner;

public class MainBiblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BibliotecaServico servico = new BibliotecaServico();

        while (true) {
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Consultar Livro");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer

            if (opcao == 1) {
                System.out.println("Digite o título do livro:");
                String titulo = scanner.nextLine();
                System.out.println("Digite o autor do livro:");
                String autor = scanner.nextLine();
                servico.cadastrar(new Livro(titulo, autor));
            } else if (opcao == 2) {
                System.out.println("Digite o título ou autor para consultar:");
                String item = scanner.nextLine();
                Livro livro = servico.consultar(item);
                if (livro != null) {
                    System.out.println("Livro encontrado: " + livro.getTitulo() + " - " + livro.getAutor());
                } else {
                    System.out.println("Livro não encontrado.");
                }
            } else if (opcao == 3) {
                System.out.println("Digite o título do livro para emprestar:");
                String titulo = scanner.nextLine();
                System.out.println("Digite o nome do emprestador:");
                String nomeDoEmprestador = scanner.nextLine();
                boolean sucesso = servico.emprestarLivro(titulo, nomeDoEmprestador);
                if (sucesso) {
                    System.out.println("Livro emprestado com sucesso.");
                } else {
                    System.out.println("Livro não disponível para empréstimo.");
                }
            } else if (opcao == 4) {
                break;
            }
        }
    }