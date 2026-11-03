package s13lab03;

public class S13Lab03CompositeMainPaso4 {
    public static void main(String[] args) {
        ModuloFormativo introduccion = new ModuloFormativo();
        ModuloFormativo ruta = new ModuloFormativo();
        System.out.println("Modulo vacio: " + introduccion.calcularMinutos());
        introduccion.agregarElementoFormativo(new Leccion(10));
        introduccion.agregarElementoFormativo(new Leccion(20));
        ruta.agregarElementoFormativo(introduccion);
        ruta.agregarElementoFormativo(new Leccion(15));
        // Paso 4: lección adicional justo después de añadir la de 15 minutos a ruta
        introduccion.agregarElementoFormativo(new Leccion(5));
        System.out.println("Introduccion: " + introduccion.calcularMinutos());
        System.out.println("Ruta: " + ruta.calcularMinutos());
        try {
            introduccion.agregarElementoFormativo(ruta);
        } catch (IllegalArgumentException error) {
            System.out.println("Ciclo rechazado");
        }
    }
}
