public class Lab02OrdenaLaSalida {
    public static void main(String[] args) {
        // TODO 1: Predecir la salida de estas tres instrucciones en un comentario.
        // Se ejecuta system.out.print("A"); y se imprime A sin salto de linea, luego se ejecuta system.out.println("B"); y se imprime B con salto de linea, luego se ejecuta system.out.println("C"); y se imprime C con salto de linea
        // resultado: AB
        // c
        System.out.print("A");
        System.out.println("B");
        System.out.println("C");

        // TODO 2: Ejecutar y explicar cualquier diferencia con tu predicción.
        // se ejecuto tal como pense
        // TODO 3: Modificar las instrucciones anteriores para obtener:
        // A - B - C
        System.out.print("A - ");
        System.out.print("B - ");
        System.out.println("C");
        // TODO 4: Agregar debajo una segunda línea que diga "Fin del laboratorio".
        System.out.println("Fin del laboratorio");
        // TODO 5: Explicar qué instrucción produce cada salto de línea.
        // system.out.println() produce un salto de línea, mientras que system.out.print() no lo hace
    }
}
