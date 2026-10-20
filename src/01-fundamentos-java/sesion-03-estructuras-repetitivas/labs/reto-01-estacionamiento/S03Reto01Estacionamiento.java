import java.util.Scanner;

public class S03Reto01Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contadores y acumuladores de la jornada
        int totalVehiculos = 0;
        int totalAutos = 0;
        int totalMotos = 0;
        long dineroRecaudado = 0L;

        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE TARIFA DE ESTACIONAMIENTO ===");
            System.out.println("1 = Automóvil");
            System.out.println("2 = Motocicleta");
            System.out.println("0 = Terminar jornada");
            System.out.print("Seleccione una opción: ");


            if (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next(); // Limpiar entrada inválida
                continue;
            }

            opcion = scanner.nextInt();


            if (opcion == 0) {
                break; // Terminar jornada
            } else if (opcion == 1 || opcion == 2) {
                System.out.print("Ingrese la cantidad de horas (mayor a 0): ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Error: Las horas deben ser un número entero.");
                    scanner.next();
                    continue;
                }

                int horas = scanner.nextInt();

                if (horas <= 0) {
                    System.out.println("Error: Las horas deben ser mayores a cero. No se registró el vehículo.");
                    continue;
                }

                // Determinar tarifa base por hora
                long tarifaHora = (opcion == 1) ? 4000L : 2000L;
                long valorInicial = tarifaHora * horas;
                long descuento = 0L;

                // Aplicar reglas de descuento único
                if (opcion == 1 && horas > 5) {
                    descuento = (valorInicial * 10L) / 100L;
                } else if (opcion == 2 && horas > 8) {
                    descuento = (valorInicial * 5L) / 100L;
                }

                long totalPagar = valorInicial - descuento;

                // Mostrar detalles para el vehículo actual
                System.out.println("\n--- COMPROBANTE DE PAGO ---");
                System.out.println("Tipo de vehículo: " + (opcion == 1 ? "Automóvil" : "Motocicleta"));
                System.out.println("Valor inicial: " + valorInicial + " pesos");
                System.out.println("Descuento: " + descuento + " pesos");
                System.out.println("Total a pagar: " + totalPagar + " pesos");
                System.out.println("---------------------------");

                // Actualizar contadores y acumulador una sola vez por vehículo válido
                totalVehiculos++;
                if (opcion == 1) {
                    totalAutos++;
                } else {
                    totalMotos++;
                }
                dineroRecaudado += totalPagar;

            } else {
                System.out.println("Error: Opción no válida. Por favor, elija 1, 2 o 0.");
            }

        } while (true);

        // Resumen final de la jornada
        System.out.println("\n========================================");
        System.out.println("        RESUMEN FINAL DE LA JORNADA     ");
        System.out.println("========================================");
        System.out.println("Vehículos totales registrados: " + totalVehiculos);
        System.out.println("Automóviles registrados:     " + totalAutos);
        System.out.println("Motocicletas registradas:    " + totalMotos);
        System.out.println("Total recaudado:             " + dineroRecaudado + " pesos");
        System.out.println("========================================");

        scanner.close();
    }
}