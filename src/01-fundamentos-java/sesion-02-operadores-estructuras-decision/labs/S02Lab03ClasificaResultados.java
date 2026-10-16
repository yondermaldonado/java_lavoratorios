public class S02Lab03ClasificaResultados {
    public static void main(String[] args) {
        int nota = 85;

        // TODO 1: Rechazar notas fuera de 0 a 100 antes de clasificarlas.
        if (nota < 0 || nota > 100) {
            // TODO 3: Mostrar "Categoria X" o "Nota invalida" según corresponda.
            System.out.println("Nota invalida");
            // TODO 2: Clasificar con if/else if/else: A desde 90, B desde 80,
            // C desde 70, D desde 60 y E por debajo de 60.
        } else if (nota >= 90) {
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

        // TODO 4: Probar nota 85, 90 y 101; las demás entradas son opcionales.
        // | nota | Salida         |
        // | 85   | Categoria B    |
        // | 90   | Categoria A    |
        // | 101  | Nota invalida  |

        // TODO 5: Explicar con nota = 95 por qué el orden de las condiciones importa.
        // Si se evaluara nota >= 60 antes de nota >= 90, el 95 cumpliría esa primera
        // condición y se mostraría "Categoria D", porque en una cadena if/else if
        // solo se ejecuta la primera rama verdadera. Por eso se evalúa primero el rango mayor.
    }
}