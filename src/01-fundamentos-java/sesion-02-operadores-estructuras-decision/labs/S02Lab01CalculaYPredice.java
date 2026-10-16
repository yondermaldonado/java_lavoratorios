public class S02Lab01CalculaYPredice {
    public static void main(String[] args) {
        int unidades = 7;
        int capacidad = 2;
        int contador = 3;

        // TODO 1: Predecir los resultados en un comentario antes de ejecutar.
        // Predicción (unidades = 7, capacidad = 2):
        // Suma: 9
        // Resta: 5
        // Producto: 14
        // Division entera: 3   (7 / 2 entre enteros descarta el .5)
        // Division decimal: 3.5
        // Resto: 1
        // Sin parentesis: 14   (primero * y luego +: 2 + 12)
        // Con parentesis: 20   (primero el paréntesis: 5 * 4)
        // Contador incrementado: 4
        // Contador decrementado: 3

        // TODO 2: Calcular y mostrar suma, resta, producto, división entera y resto.
        int suma = unidades + capacidad;
        int resta = unidades - capacidad;
        int producto = unidades * capacidad;
        int divisionEntera = unidades / capacidad;
        int resto = unidades % capacidad;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("Division entera: " + divisionEntera);

        // TODO 3: Mostrar 7.0 / capacidad y explicar por qué conserva decimales.
        double divisionDecimal = 7.0 / capacidad;
        System.out.println("Division decimal: " + divisionDecimal);
        // Conserva decimales porque 7.0 es un double: cuando un double se opera con
        // un int, Java convierte el int a double y la división es decimal.

        System.out.println("Resto: " + resto);

        // TODO 4: Comparar 2 + 3 * 4 con (2 + 3) * 4.
        System.out.println("Sin parentesis: " + (2 + 3 * 4));
        System.out.println("Con parentesis: " + ((2 + 3) * 4));

        // TODO 5: Incrementar contador en una sentencia, mostrarlo; decrementar y mostrarlo.
        contador++;
        System.out.println("Contador incrementado: " + contador);
        contador--;
        System.out.println("Contador decrementado: " + contador);

        // TODO 6 (opcional): Probar unidades = 8 y explicar qué cambia. Mantener capacidad = 2.
        // Con unidades = 8 (capacidad = 2): Suma 10, Resta 6, Producto 16,
        // Division entera 4, Resto 0, Division decimal 3.5 (sin cambio).
        // Cambian todas las que usan la variable unidades. La decimal NO cambia
        // porque su numerador es el literal 7.0, no la variable unidades.

        // TODO 7: Registrar predicción, resultado y causa de cualquier diferencia.
        // Las diez líneas observadas coinciden con la predicción, no hubo diferencias.
        // (La tabla predicción vs. resultado está en RESULTADOS.md.)
    }
}