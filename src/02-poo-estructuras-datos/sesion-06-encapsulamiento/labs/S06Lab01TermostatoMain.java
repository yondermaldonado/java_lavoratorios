public class S06Lab01TermostatoMain {
    public static void main(String[] args) {
        // TODO 5: Crear un termostato y mostrar su temperatura inicial.

        S06Termostato temperatura1 = new S06Termostato();
        S06Termostato temperatura2 = new S06Termostato();

        System.out.println("Temperatura 1: " + temperatura1.getTemperaturaObjetivo());
        System.out.println("Temperatura 2: " + temperatura2.getTemperaturaObjetivo());

        // TODO 6: Solicitar 24, 31 y 16; mostrar cada resultado y la temperatura posterior.

        System.out.println("ajustar temperatura1 24: " + temperatura1.ajustarTemperatura(24));
        System.out.println("ajustar temperatura1 31: " + temperatura1.ajustarTemperatura(31));
        System.out.println("ajustar temperatura1 16: " + temperatura1.ajustarTemperatura(16));


    }
}
