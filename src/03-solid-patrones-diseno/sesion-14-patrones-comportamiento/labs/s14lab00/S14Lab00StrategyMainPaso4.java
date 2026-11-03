package s14lab00;

public class S14Lab00StrategyMainPaso4 {
    public static void main(String[] args) {
        System.out.println("Regular 10: " + new Carrito(new Regular()).total(1_000, 10));
        System.out.println("Fidelizado 10: " + new Carrito(new Fidelizado()).total(1_000, 10));
        // Paso 4: antes era new Carrito(new Mayorista())
        Carrito carrito = new Carrito(new Fidelizado());
        System.out.println("Fidelizado 9: " + carrito.total(1_000, 9));
        System.out.println("Fidelizado 10: " + carrito.total(1_000, 10));
    }
}
