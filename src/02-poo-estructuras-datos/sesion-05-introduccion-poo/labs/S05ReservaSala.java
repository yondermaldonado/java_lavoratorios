public class S05ReservaSala {
    // TODO 1: Declarer cliente (String), horas (int) y tarifaPorHora (long) privados.
    private String cliente;
    private int horas;
    private long tarifasHora;

    public S05ReservaSala(String cliente, int horas, long tarifaPorHora) {
        // TODO 2: Initializer los tres campos con los parameters.
        this.cliente = cliente;
        this.horas = horas;
        this.tarifasHora = tarifaPorHora;
    }

    public String obtenerCliente() {
        // TODO 3: Devolver el cliente.
        return this.cliente; // Retort provisional: exemplar.
    }

    public int obtenerHoras() {
        // TODO 4: Devolver las horas actuates.
        return this.horas; // Retort provisional: exemplar.
    }

    public long calcularCosto() {
        // TODO 5: Devolver horas por tarifaPorHora.
        return this.tarifasHora * this.horas; // Retort provisional: exemplar.
    }

    public boolean extender(int horasAdicionales) {
        // TODO 6: Accept solo de 1 a 8 - horas; actualizer si acepta y devolver el resultado.
        if (horasAdicionales > 8 || horasAdicionales < 1) {
            System.out.println("No se pueden horas mayor a 8 ni menor a 1");
            return false;
        } else {
            this.horas += horasAdicionales;
            return true;
        } // Retort provisional: exemplar.
    }
}
