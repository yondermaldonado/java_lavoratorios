public class S02Lab03ClasificaResultados {
    public static void main(String[] args) {
        int nota = 101;

        // TODO 1: Rechazar notas fuera de 0 a 100 antes de clasificarlas.
        if (nota < 0 || nota > 100) {
            // TODO 3: Mostrar "Categoria X" o "Nota invalida" según corresponda.
            System.out.println("Nota invalida");
        // TODO 2: Clasificar con if/else if/else: A desde 90, B desde 80,
        // C desde 70, D desde 60 y E por debajo de 60.
        } else {
            if (nota >= 90) {
                System.out.println("Categoria A");
            } else if (nota >= 80) {
                System.out.println("Categoria B");
            } else if (nota >= 70) {
                System.out.println("Categoria C");
            } else if (nota >= 60) {
                System.out.println("Categoria D");
            } else {
                System.out.println("Categoria E");
            }
        }
        // TODO 4: Probar nota 85, 90 y 101; las demás entradas son opcionales.
        // TODO 5: Explicar con nota = 95 por qué el orden de las condiciones importa.
        // El orden de las condiciones importa porque si se colocara la condición de nota >= 60 , la nota 95 sería clasificada como D en lugar de A.
    }
}
