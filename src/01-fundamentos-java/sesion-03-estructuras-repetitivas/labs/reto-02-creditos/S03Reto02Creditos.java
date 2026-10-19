import java.util.Scanner;

public class S03Reto02Creditos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evaluadas = 0;
        int aprobadas = 0;
        int revision = 0;
        int rechazadas = 0;

        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n=== SIMULADOR DE CRÉDITOS ===");
            System.out.println("1 = Nueva solicitud");
            System.out.println("0 = Finalizar");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {

                // Cada dato se pide de nuevo mientras esté fuera de rango
                long edad;
                do {
                    System.out.print("Edad (0 a 120): ");
                    edad = sc.nextLong();
                } while (edad < 0 || edad > 120);

                long ingresos;
                do {
                    System.out.print("Ingresos mensuales (0 a 1000000000): ");
                    ingresos = sc.nextLong();
                } while (ingresos < 0 || ingresos > 1000000000);

                long gastos;
                do {
                    System.out.print("Gastos mensuales (0 a 1000000000): ");
                    gastos = sc.nextLong();
                } while (gastos < 0 || gastos > 1000000000);

                long credito;
                do {
                    System.out.print("Crédito solicitado (1 a 1000000000): ");
                    credito = sc.nextLong();
                } while (credito < 1 || credito > 1000000000);

                long meses;
                do {
                    System.out.print("Meses (1 a 360): ");
                    meses = sc.nextLong();
                } while (meses < 1 || meses > 360);

                String resultado;

                if (edad < 18 || edad > 70 || ingresos <= gastos) {
                    // No se divide: o la edad no sirve o no hay dinero disponible
                    resultado = "RECHAZADA";
                } else {
                    long disponible = ingresos - gastos;
                    double cuota = (double) credito / meses;
                    double endeudamiento = credito * 100.0 / (disponible * meses);

                    System.out.println("Disponible: $" + disponible);
                    System.out.println("Cuota aproximada: $" + Math.round(cuota));
                    System.out.println("Endeudamiento: " + endeudamiento + " %");

                    // Comparación exacta con enteros, sin dividir
                    if (credito * 100 <= disponible * meses * 35) {
                        resultado = "APROBADA";
                    } else if (credito * 100 <= disponible * meses * 45) {
                        resultado = "REVISIÓN MANUAL";
                    } else {
                        resultado = "RECHAZADA";
                    }
                }

                System.out.println("Resultado: " + resultado);

                evaluadas++;
                if (resultado.equals("APROBADA")) {
                    aprobadas++;
                } else if (resultado.equals("REVISIÓN MANUAL")) {
                    revision++;
                } else {
                    rechazadas++;
                }

            } else if (opcion != 0) {
                System.out.println("Opción inválida, intente de nuevo.");
            }
        }

        System.out.println("\n=== RESUMEN ===");
        System.out.println("Evaluadas: " + evaluadas);
        System.out.println("Aprobadas: " + aprobadas);
        System.out.println("Revisión manual: " + revision);
        System.out.println("Rechazadas: " + rechazadas);

        sc.close();
    }
}