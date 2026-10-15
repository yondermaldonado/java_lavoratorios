public class Lab03DatosConSentido {
    public static void main(String[] args) {
        // TODO 1: Elegir y justificar los tipos para nombre, edad, temperatura,
        // inicial y activo. Usa String, int, double, char y boolean.
        // nombre: String porque es una cadena de texto
        // edad: int porque es un numero entero
        // temperatura: double porque es un numero decimal
        // inicial: char porque es un solo caracter
        // activo: boolean porque es un valor verdadero o falso
        // TODO 2: Declarar e inicializar las cinco variables con nombres claros.
        String nombre = "Yonder";
        int edad = 18;
        double temperatura = 36.5;
        char inicial = 'Y';
        boolean activo = true;
        // TODO 3: Mostrar cada dato en su propia línea, con una etiqueta.
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(temperatura);
        System.out.println(inicial);
        System.out.println(activo);
        // TODO 4: Probar el caso A del README; el caso B es opcional.
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Activo: " + activo);
        // TODO 5: Explicar por qué String no es un tipo primitivo.
        // porque es una clase mientras que los tipos primitivos son tipos de datos basicos que no son objetos, String es un objeto que tiene metodos y propiedades
    }
}
