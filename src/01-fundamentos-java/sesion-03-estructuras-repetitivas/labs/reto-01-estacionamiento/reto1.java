import java.util.Scanner;

public class reto1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long descuento = 0;
        long total = 0;
        int motos = 0;
        int carros = 0;

        long totalPagar = 0;
        long tarifaM = 2000;
        long tarifaC = 4000;

        long inicialN = 0;

        int opcion ;
        int horas = 0;
        do {
            System.out.println("\n=== SISTEMA DE TARIFA DE ESTACIONAMIENTO ===");
            System.out.println("1 = Motocicleta");
            System.out.println("2 = Automóvil");
            System.out.println("0 = Terminar jornada");
            System.out.print("Seleccione una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next();
                continue;
            }

            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("\n=========== MOTOCICLETAS ================");
                System.out.println("Motocicleta: SELECIONADA");
                System.out.printf("cuantas horas (1 o mas): ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número entero válido.");
                    scanner.next();
                    continue;
                }

                horas =  scanner.nextInt();

                if (horas <= 0){
                    System.out.println("ERROR: cero o menos");
                    continue;}

                inicialN = tarifaM * horas;
                descuento = horas > 8 ? (inicialN * 5 / 100) : 0;
                totalPagar = inicialN - descuento;
                System.out.println("\n=========== MOTOCICLETAS ================");
                System.out.println("Motocicleta: SELECIONADA");
                System.out.println("Horas: " + horas);
                System.out.println("Valor: " + inicialN);
                System.out.println("Descuento: " + descuento);
                System.out.println("Total: " + totalPagar);
                motos++;
                total += totalPagar;
                }
            else if (opcion == 2) {
                System.out.println("\n=========== CARROS ================");
                System.out.println("Carro: SELECIONADO");
                System.out.printf("Cuantas horas (1 o mas): ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número entero válido.");
                    scanner.next();
                    continue;
                }
                horas =  scanner.nextInt();

                if (horas <= 0){
                    System.out.printf("ERROR: cero o menos");
                    continue;}

                inicialN = tarifaM * horas;
                descuento = horas > 5 ? (inicialN * 10 / 100) : 0;
                totalPagar = inicialN - descuento;
                System.out.println("\n=========== CARRO ================");
                System.out.println("carro: SELECIONADO");
                System.out.println("Horas: " + horas);
                System.out.println("Inicial n: " + inicialN);
                System.out.println("Descuento: " + descuento);
                System.out.println("Total: " + totalPagar);
                carros++;
                total += totalPagar;

            }else if (opcion == 0) {
                System.out.println("ADIOS");
                break;
            } else {
                System.out.println("Error: Opción no válida. Por favor, elija 1, 2 o 0.");
            }
        } while (true);

        System.out.println("\n========================================");
        System.out.println("        RESUMEN FINAL DE LA JORNADA     ");
        System.out.println("========================================");
        System.out.println("Vehículos totales registrados: " + (motos + carros));
        System.out.println("Automóviles registrados:     " + carros);
        System.out.println("Motocicletas registradas:    " + motos);
        System.out.println("Total recaudado:             " + total + " pesos");
        System.out.println("========================================");
    }
}