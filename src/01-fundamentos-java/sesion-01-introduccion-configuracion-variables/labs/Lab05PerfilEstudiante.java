public class Lab05PerfilEstudiante {
    public static void main(String[] args) {
        // TODO 1: Identificar los tipos de nombre, edad, ciudad, promedio y activo.
        String nombre;
        int edad;
        String ciudad;
        double promedio;
        boolean activo;
        // TODO 2: Declarar e inicializar esos datos con nombres claros.
        nombre = "Yonder";
        edad = 18;
        ciudad = "Cucuta";
        promedio = 8.5;
        activo = true;
        // TODO 3: Declarar final String CURSO con el valor "Java".
        final String CURSO = "Java";
        // TODO 4: Mostrar la ficha inicial con etiquetas legibles.
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Activo: " + activo);
        System.out.println("Curso: " + CURSO);
        // TODO 5: Reasignar ciudad para representar un cambio de residencia y mostrar
        // "Ciudad actualizada: " con el nuevo valor, conservando el mismo tipo.
        ciudad = "Bogota";
        System.out.println("Ciudad actualizada: " + ciudad);
        // TODO 6: Probar el perfil A del README; el perfil B es opcional.
        ciudad = "Cucuta";
        System.out.println("=== Perfil del estudiante ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Activo: " + activo);
        System.out.println("Curso: " + CURSO);
         ciudad = "Bogota";
        System.out.println("Ciudad actualizada: " + ciudad);
        // TODO 7: Colocar un breakpoint antes de la reasignación; observar ciudad,
        // usar Step Over y registrar el valor anterior y el nuevo.
        // ciudad antes de la reasignación: Cucuta
        // ciudad despues de la reasignación: Bogota
        // TODO 8: Explicar una elección de tipo y qué garantiza final en CURSO.
        // Elegi el tipo String para nombre y ciudad porque son cadenas de texto, el tipo int para edad porque es un numero entero, el tipo double para promedio porque es un numero decimal y el tipo boolean para activo porque es un valor verdadero o falso. Final garantiza que CURSO no pueda ser reasignado a otro valor, es decir, su valor es constante
    }
}
