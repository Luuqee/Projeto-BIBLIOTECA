package tech.ada.poo.base.servico.biblioteca.model;

public class Livro extends tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo {

    public class Livro {
        private String titulo;
        private String autor;
        private boolean emprestado;
        private String nomeDoEmprestador;
        private String dataDeEmprestimo;

        // Construtor
        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
            this.emprestado = false;
        }

        // Getters e Setters
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public boolean isEmprestado() {
            return emprestado;
        }

        public void setEmprestado(boolean emprestado) {
            this.emprestado = emprestado;
        }

        public String getNomeDoEmprestador() {
            return nomeDoEmprestador;
        }

        public void setNomeDoEmprestador(String nomeDoEmprestador) {
            this.nomeDoEmprestador = nomeDoEmprestador;
        }

        public String getDataDeEmprestimo() {
            return dataDeEmprestimo;
        }

        public void setDataDeEmprestimo(String dataDeEmprestimo) {
            this.dataDeEmprestimo = dataDeEmprestimo;
        }
    }
