import java.util.Locale;
import java.util.Scanner;

public class S03Reto03Calidad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Para que los decimales se escriban con punto (9.8) y no con coma
        sc.useLocale(Locale.US);

        // Cantidad de piezas: entero mayor que cero
        int cantidad;
        do {
            System.out.print("Cantidad de piezas del lote (mayor que 0): ");
            cantidad = sc.nextInt();
        } while (cantidad <= 0);

        int inspeccionadas = 0;
        int aprobadas = 0;
        int reproceso = 0;
        int rechazadas = 0;
        int rechazadasConsecutivas = 0;
        double sumaMedidas = 0;

        // Se repite mientras queden piezas y no haya tres rechazos seguidos
        while (inspeccionadas < cantidad && rechazadasConsecutivas < 3) {

            // La medida se vuelve a pedir para la misma pieza hasta que sea válida
            double medida;
            do {
                System.out.print("Medida de la pieza " + (inspeccionadas + 1) + " en mm (ej. 9.8): ");
                medida = sc.nextDouble();
            } while (medida <= 0 || Double.isNaN(medida) || Double.isInfinite(medida));

            inspeccionadas++;
            sumaMedidas = sumaMedidas + medida;

            if (medida >= 9.8 && medida <= 10.2) {
                aprobadas++;
                rechazadasConsecutivas = 0;
                System.out.println("APROBADA");
            } else if ((medida >= 9.5 && medida < 9.8) || (medida > 10.2 && medida <= 10.5)) {
                reproceso++;
                rechazadasConsecutivas = 0;
                System.out.println("REPROCESO");
            } else {
                rechazadas++;
                rechazadasConsecutivas++;
                System.out.println("RECHAZADA");
            }
        }

        if (rechazadasConsecutivas == 3) {
            System.out.println("ALERTA: detener la linea de produccion.");
        }

        // inspeccionadas siempre es mayor que 0 porque la primera medida válida se cuenta
        double porcentajeAprobacion = 100.0 * aprobadas / inspeccionadas;
        double promedio = sumaMedidas / inspeccionadas;

        System.out.println("\n=== RESUMEN ===");
        System.out.println("Piezas inspeccionadas: " + inspeccionadas);
        System.out.println("Aprobadas: " + aprobadas);
        System.out.println("Reproceso: " + reproceso);
        System.out.println("Rechazadas: " + rechazadas);
        System.out.println("Aprobacion: " + porcentajeAprobacion + " %");
        System.out.println("Promedio: " + promedio + " mm");

        sc.close();
    }
}