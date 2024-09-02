package tech.ada.poo.base.servico.biblioteca.service;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;
import tech.ada.poo.base.servico.biblioteca.model.Livro;

public interface BibliotecaService {

    void cadastrarLivro(Livro livro);
    String reservar(String titulo);
    ItemCatalogo consultar(String titulo);

}


