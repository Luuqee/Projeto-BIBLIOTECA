package tech.ada.poo.base.servico.biblioteca.model;

public class Livro extends ItemCatalogo {

    public Livro (String titulo) {
        super.setTitulo(titulo);
    }

    public class Livro {
        private String titulo;
        private String autor;

        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public class Livro {
            private String titulo;
            private String autor;

            // Construtor
            public Livro(String titulo, String autor) {
                this.titulo = titulo;
                this.autor = autor;
            }

            // Getter para título
            public String getTitulo() {
                return titulo;
            }

            // Setter para título
            public void setTitulo(String titulo) {
                this.titulo = titulo;
            }

            // Getter para autor
            public String getAutor() {
                return autor;
            }

            // Setter para autor
            public void setAutor(String autor) {
                this.autor = autor;
            }
        }
    }
}
