package src.main.java.tech.ada.poo.base.servico.biblioteca;
import java.util.Scanner;

import src.main.java.tech.ada.poo.base.servico.biblioteca.BibliotecaServico;
import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;
import tech.ada.poo.base.servico.biblioteca.model.Livro;
import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorio;
import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorioListImpl;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceFisica;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceFisicaImpl;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceVirtual;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceVirtualImpl;

        public class MainBiblioteca {
            private static BibliotecaRepositorio servico;

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