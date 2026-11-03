package s12lab02;
import java.time.LocalDate;

public class S12Lab02BuilderMain {
    public static void main(String[] args) {
        ReservaBuilder builder = new ReservaBuilder().huesped("Luis")
                .fecha(LocalDate.of(2026, 3, 5)).desayuno(true).estacionamiento(true);
        Reserva primera = builder.build();
        Reserva segunda = builder.lateCheckout(true).build();
        System.out.println(primera.resumen());
        System.out.println(segunda.resumen());
        System.out.println("Primera conserva lateCheckout: " + primera.tieneLateCheckout());
        System.out.println("Objetos distintos: " + (primera != segunda));
        try {
            new ReservaBuilder().fecha(LocalDate.of(2026, 2, 10)).build();
        } catch (IllegalStateException error) {
            System.out.println("Reserva rechazada: " + error.getMessage());
        }
        ReservaBuilder builderr = new ReservaBuilder().huesped("Ana").desayuno(true).estacionamiento(true);
        Reserva primeras = builderr.build();
        Reserva segundas = builderr.lateCheckout(true).build();
        System.out.println(primera.resumen());
        System.out.println(segunda.resumen());
        System.out.println("Primera conserva lateCheckout: " + primera.tieneLateCheckout());
        System.out.println("Objetos distintos: " + (primera != segunda));
        try {
            new ReservaBuilder().fecha(LocalDate.of(2026, 2, 10)).build();
        } catch (IllegalStateException error) {
            System.out.println("Reserva rechazada: " + error.getMessage());
        }
    }
}
