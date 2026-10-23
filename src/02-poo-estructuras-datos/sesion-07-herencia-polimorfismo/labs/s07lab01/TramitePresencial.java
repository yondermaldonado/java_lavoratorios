package s07lab01;

public class TramitePresencial extends Tramite {
    public TramitePresencial(String codigo) {
        super(codigo);
    }

    // TODO 3: Agregar @Override y devolver la descripcion usando getCodigo().
    public String descripcion() {
        return "Tramite presencial: " + getCodigo(); // Retorno provisional: reemplazar.
    }
}
