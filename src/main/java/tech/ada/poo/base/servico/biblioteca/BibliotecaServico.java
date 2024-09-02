package src.main.java.tech.ada.poo.base.servico.biblioteca;

public class BibliotecaServico {

    import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

    public class BibliotecaServico {

        private List<Livro> livros = new ArrayList<>();

        public Livro consultar(String item) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(item) || livro.getAutor().equalsIgnoreCase(item)) {
                    return livro;
                }
            }
            return null;
        }

        public boolean emprestarLivro(String titulo, String nomeDoEmprestador) {
            Livro livro = consultar(titulo);
            if (livro != null && !livro.isEmprestado()) {
                livro.setEmprestado(true);
                livro.setNomeDoEmprestador(nomeDoEmprestador);
                livro.setDataDeEmprestimo(LocalDate.now().toString());
                return true;
            }
            return false;
        }


    }

}
