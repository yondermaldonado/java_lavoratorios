public class S05Lab02MedidasRectangulo {
    public static void main(String[] args) {
        // TODO 6: Crear primeraFigura de 5 por 3 y segundaFigura de 4 por 4.

        S05Rectangulo figura1 = new S05Rectangulo(5, 3);
        S05Rectangulo figura2 = new S05Rectangulo(4, 4);

        // TODO 7: Mostrar area, perimetro y esCuadrado de cada figura.

        System.out.println("Area: " + figura1.calcularArea());
        System.out.println("Perimetro: " + figura1.calcularPerimetro());
        System.out.println("Es cuadrado: " + figura1.esCuadrado());

        System.out.println("Area: " + figura2.calcularArea());
        System.out.println("Perimetro: " + figura2.calcularPerimetro());
        System.out.println("Es cuadrado: " + figura2.esCuadrado());
    }
}
