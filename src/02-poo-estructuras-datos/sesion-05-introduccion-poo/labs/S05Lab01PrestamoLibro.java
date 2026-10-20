public class S05Lab01PrestamoLibro {
    public static void main(String[] args) {
        // TODO 7: Crear primerLibro con El principito y segundoLibro con Matilda.
        S05LibroPrestamo libro1 = new S05LibroPrestamo("harry potter");
        S05LibroPrestamo libro2 = new S05LibroPrestamo("holamundo");
        S05LibroPrestamo libro3 = new S05LibroPrestamo("tres tristres tigres");

        // TODO 8: Mostrar titulo, dos intentos de prestamo y estado del primer libro.
        System.out.println("Título del primer libro: " + libro1.obtenerTitulo());
        System.out.println("Título del primer libro: " + libro2.obtenerTitulo());
        System.out.println("Título del primer libro: " + libro3.obtenerTitulo());

        System.out.println("Primer intento de préstamo: " + libro1.prestar()); // Debería ser true
        System.out.println("Segundo intento de préstamo: " + libro1.prestar()); // Debería ser false (rechazado)
        System.out.println("¿El primer libro está prestado?: " + libro1.estaPrestado()); // Debería ser true

        // TODO 9: Devolver el primer libro y mostrar el estado de ambos libros.
        libro1.devolver();
        System.out.println(libro1.estaPrestado());
    }
}
