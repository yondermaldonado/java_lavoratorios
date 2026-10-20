
public class Lab04DiagnosticaYCorrige {
    public static void main(String[] args) {
        // En tu copia personal, activa un caso por vez, lee el error y repáralo.
        // Los casos están comentados para que esta plantilla pueda compilar.
        // Caso 1: String nombre = 'Ana';
        // TODO 1: Corregir las comillas, mostrar el nombre y explicar la causa.
        String nombre = "Ana";
        System.out.println(nombre);
        // porque se usaron comillas simples en lugar de doble
        // Caso 2: int temperatura = 23.5;
        // TODO 2: Conservar el valor decimal usando un tipo adecuado y mostrarlo.
        double temperatura = 24.2;
        System.out.println(temperatura);
        // porque se uso el tipo de dato int en vez de double
        // Caso 3:
        // int edad;
        // System.out.println(edad);
        // TODO 3: Inicializar edad antes de mostrarla y explicar por qué es necesario.
        int edad = 25;
        System.out.println(edad);
        // porque se inicio la variable pero no se le asigno ningun valor
        // Caso 4:
        // final String CURSO = "Java";
        // CURSO = "Python";
        // TODO 4: Conservar CURSO como final y mostrar "Java", sin reasignarlo.
        final String CURSO = "Java";
        System.out.println(CURSO);
        // porque si se coloca final no se puede reasignar un valor
        // TODO 5: Registrar los cuatro mensajes del compilador en tu README personal,
        // junto con la causa y la corrección aplicada a cada caso.
        //Invalid character constant
        //Type mismatch: cannot convert from double to int
        //Variable edad might not have been initialized
        //The final local variable CURSO cannot be assigned, since it is a constant

    }
}
