public class S05Lab03ReservaSala {
    public static void main(String[] args) {
        // TODO 7: Crear reservaAna (2 horas, 15000 pesos/hora) y reservaLuis (1, 20000).
        S05ReservaSala reserva1 = new S05ReservaSala("Yonder", 1, 15000);
        S05ReservaSala reserva2 = new S05ReservaSala("Daniel", 2, 20000);
        // TODO 8: Mostrar los resultados de extender la reserva de Ana en 1, 6 y 0 horas.

        System.out.println("Extender reserva1: " + reserva1.extender(1));
        System.out.println("Extender reserva1: " + reserva1.extender(6));
        System.out.println("Extender reserva1: " + reserva1.extender(0));

        System.out.println("Extender reserva2: " + reserva2.extender(1));
        System.out.println("Extender reserva2: " + reserva2.extender(6));
        System.out.println("Extender reserva2: " + reserva2.extender(0));
        // TODO 9: Mostrar cliente, horas y costo final de ambas reservas.

        System.out.println("cliente: " + reserva1.obtenerCliente());
        System.out.println("horas: " + reserva1.obtenerHoras());
        System.out.println("costo final: " + reserva1.calcularCosto());

        System.out.println("cliente: " + reserva2.obtenerCliente());
        System.out.println("horas: " + reserva2.obtenerHoras());
        System.out.println("costo final: " + reserva2.calcularCosto());
    }
}
