package s12lab04;

public class S12Lab04SingletonMainPaso4 {
    public static void main(String[] args) {
        ContadorMetricas primera = ContadorMetricas.obtenerInstancia();
        ContadorMetricas segunda = ContadorMetricas.obtenerInstancia();
        System.out.println("Misma instancia: " + (primera == segunda));
        System.out.println("Total inicial: " + primera.consultar());

        ProcesoLaboratorio procesoA = new ProcesoLaboratorio(primera);
        ProcesoLaboratorio procesoB = new ProcesoLaboratorio(segunda);

        // Paso 4: cantidades 1 y 1
        procesoA.registrarEventos(1);
        procesoB.registrarEventos(1);

        System.out.println("Total desde A: " + primera.consultar());
        System.out.println("Total desde B: " + segunda.consultar());
    }
}
