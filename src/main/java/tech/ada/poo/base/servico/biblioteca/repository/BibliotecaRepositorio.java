package tech.ada.poo.base.servico.biblioteca.repository;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;

public interface BibliotecaRepositorio {

    void salvar(Livro livro);

    ItemCatalogo cadastrar(ItemCatalogo item);

    ItemCatalogo consultar(String titulo);

    ItemCatalogo atualizar(ItemCatalogo item);

}
