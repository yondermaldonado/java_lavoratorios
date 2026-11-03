package s12lab03;

public class S12Lab03PrototypeMainPaso5 {
    public static void main(String[] args) {
        Rutina base = new Rutina("Base");
        base.agregar("Sentadillas", 10);
        base.agregar("Flexiones", 8);

        Rutina personal = base.copiar("Personal");
        personal.cambiarRepeticiones(0, 15);
        personal.agregar("Plancha", 1);

        // Paso 5: cambiar la base DESPUÉS de copiar
        base.cambiarRepeticiones(1, 12);
        System.out.println("--- Paso 5: cambio en Base despues de copiar ---");
        System.out.println(base.resumen());
        System.out.println(personal.resumen());

        // Paso 6: comprobaciones con entradas inválidas
        System.out.println("--- Paso 6: comprobaciones ---");
        boolean indiceMenosUno = personal.cambiarRepeticiones(-1, 20);
        System.out.println("Comprobacion 1 -> entrada: indice -1, rep 20 | esperado: false | obtenido: " + indiceMenosUno);
        System.out.println(personal.resumen());

        boolean rep101 = personal.cambiarRepeticiones(0, 101);
        System.out.println("Comprobacion 2 -> entrada: indice 0, rep 101 | esperado: false | obtenido: " + rep101);
        System.out.println(personal.resumen());
    }
}
