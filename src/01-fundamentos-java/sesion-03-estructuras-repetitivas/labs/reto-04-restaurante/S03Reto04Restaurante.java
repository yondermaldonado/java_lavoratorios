import java.util.Scanner;

public class S03Reto04Restaurante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long subtotal = 0;
        long unidades = 0;

        int opcion = 0;

        // El menú se repite hasta que el cliente elija 5 (Finalizar pedido)
        while (opcion != 5) {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1 = Hamburguesa - 18000 pesos");
            System.out.println("2 = Pizza - 25000 pesos");
            System.out.println("3 = Ensalada - 15000 pesos");
            System.out.println("4 = Bebida - 6000 pesos");
            System.out.println("5 = Finalizar pedido");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {

                // Precio según la opción elegida
                long precio;
                if (opcion == 1) {
                    precio = 18000;
                } else if (opcion == 2) {
                    precio = 25000;
                } else if (opcion == 3) {
                    precio = 15000;
                } else {
                    precio = 6000;
                }

                // La cantidad se pide de nuevo mientras no sea mayor que cero
                long cantidad;
                do {
                    System.out.print("Cantidad: ");
                    cantidad = sc.nextLong();
                    if (cantidad <= 0) {
                        System.out.println("Cantidad inválida. Debe ser mayor que cero.");
                    }
                } while (cantidad <= 0);

                long importe = precio * cantidad;
                subtotal = subtotal + importe;
                unidades = unidades + cantidad;

                System.out.println("Importe agregado: $" + importe);

            } else if (opcion != 5) {
                System.out.println("Opción inválida. Elija una opción del 1 al 5.");
            }
        }

        // Una sola tasa de descuento: se comprueba primero la mayor
        long porcentaje;
        if (subtotal > 150000) {
            porcentaje = 15;
        } else if (subtotal > 100000) {
            porcentaje = 10;
        } else {
            porcentaje = 0;
        }

        long descuento = subtotal * porcentaje / 100;
        long neto = subtotal - descuento;

        // Domicilio de 5000 si el neto es menor que 30000 y el pedido no está vacío
        long domicilio = 0;
        if (unidades > 0 && neto < 30000) {
            domicilio = 5000;
        }

        long total = neto + domicilio;

        System.out.println("\n=== RESUMEN DEL PEDIDO ===");
        System.out.println("Unidades solicitadas: " + unidades);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Domicilio: $" + domicilio);
        System.out.println("Total: $" + total);

        sc.close();
    }
}