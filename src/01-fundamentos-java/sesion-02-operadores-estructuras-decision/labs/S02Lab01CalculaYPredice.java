public class S02Lab01CalculaYPredice {
    public static void main(String[] args) {
        int unidades = 7;
        int capacidad = 2;
        int contador = 3;

        // TODO 1: Predecir los resultados en un comentario antes de ejecutar.
        // resultado de suma: 9
        // resultado de resta: 5
        // resultado de producto: 14
        // resultado de division entera: 3
        // resultado de resto: 1
        // TODO 2: Calcular y mostrar suma, resta, producto, división entera y resto.
        System.out.println("resultado de suma: " + (unidades + capacidad));
        System.out.println("resultado de resta: " + (unidades - capacidad));
        System.out.println("resultado de producto: " + (unidades * capacidad));
        System.out.println("resultado de división entera: " + (unidades / capacidad));
        System.out.println("resultado de resto: " + (unidades % capacidad));
        // TODO 3: Mostrar 7.0 / capacidad y explicar por qué conserva decimales.
        System.out.println("resultado de division con decimales: " + (7.0 / capacidad));
        // conserva decimales porque 7.0 es un double y al dividirlo por un int, el resultado es un double
        // TODO 4: Comparar 2 + 3 * 4 con (2 + 3) * 4.
        System.out.println("resultado de 2 + 3 * 4: " + (2 + 3 * 4));
        System.out.println("resultado de (2 + 3) * 4: " + ((2 + 3) * 4));
        // TODO 5: Incrementar contador en una sentencia, mostrarlo; decrementar y mostrarlo.
        contador++;
        System.out.println("contador incrementado: " + contador);
        contador--;
        System.out.println("contador decrementado: " + contador);
        // TODO 6 (opcional): Probar unidades = 8 y explicar qué cambia. Mantener capacidad = 2.
        unidades = 8;
        System.out.println("resultado de suma: " + (unidades + capacidad));
        System.out.println("resultado de resta: " + (unidades - capacidad));
        System.out.println("resultado de producto: " + (unidades * capacidad));
        System.out.println("resultado de división entera: " + (unidades / capacidad));
        System.out.println("resultado de resto: " + (unidades % capacidad));
        // cambia el resultado de suma, resta, producto, division entera y resto porque se esta usando un valor diferente para unidades, lo que afecta los resultados de las operaciones aritmeticas
        // TODO 7: Registrar predicción, resultado y causa de cualquier diferencia.
        // en el todo 2 el resulrado fueron los mismos que predije, en el todo 6 el resultado cambio porque cambie el valor de unidades de 7 a 8, lo que afecto los resultados de las operaciones aritmeticas
    }
}
