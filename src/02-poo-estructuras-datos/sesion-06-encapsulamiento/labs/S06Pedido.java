public class S06Pedido {
    // TODO 1: Declarar estado como campo privado String.
    private String estado;
    public S06Pedido() {
        // TODO 2: Inicializar el estado en PENDIENTE.
        this.estado = "PENDIENTE";
    }

    public String getEstado() {
        // TODO 3: Devolver el estado actual.
        return this.estado; // Retorno provisional: reemplazar.
    }

    public boolean enviar() {
        // TODO 4: Enviar solo un pedido PENDIENTE; cambiar a ENVIADO y devolver si acepta.
        if (this.estado.equals("PENDIENTE")){
            this.estado = "ENVIADO";
            return true;
        }else{
            return false;
        }
         // Retorno provisional: reemplazar.
    }

    public boolean cancelar() {
        // TODO 5: Cancelar solo un pedido PENDIENTE; cambiar a CANCELADO y devolver si acepta.
        if (this.estado.equals("PENDIENTE")){
            this.estado = "CANCELADO";
            return true;
        }else{
            return false;
        }
         // Retorno provisional: reemplazar.
    }
}
