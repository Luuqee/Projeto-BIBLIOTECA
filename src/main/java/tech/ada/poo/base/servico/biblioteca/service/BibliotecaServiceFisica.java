package tech.ada.poo.base.servico.biblioteca.service;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;

public interface BibliotecaServiceFisica extends BibliotecaService {

    void emprestar();
    void devolver();
    void cadastrar(ItemCatalogo item);

    tech.ada.poo.base.servico.biblioteca.model.Livro consultar(String item) {
        Iterable<? extends tech.ada.poo.base.servico.biblioteca.model.Livro.Livro.Livro> livros = null;
        for (tech.ada.poo.base.servico.biblioteca.model.Livro.Livro.Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(item) || livro.getAutor().equalsIgnoreCase(item)) {
                return livro;
            }
        }
        return null; // Retorna null se o livro não for encontrado
    }
}
