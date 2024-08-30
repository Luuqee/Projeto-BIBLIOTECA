package tech.ada.poo.base.servico.biblioteca.model;

public abstract class ItemCatalogo {

    private int codigo;

    private String titulo;

    private String reserva;

    @Override
    public String toString() {
        return String.format("%03d", codigo) + " " + titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isReservado() {
        return this.reserva != null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && !(obj instanceof ItemCatalogo)) return false;
        ItemCatalogo item = (ItemCatalogo) obj;

        if ( this.titulo.equals(item.getTitulo()) ) // refatorar para ignore case
            return true;

        return false;
    }
}
