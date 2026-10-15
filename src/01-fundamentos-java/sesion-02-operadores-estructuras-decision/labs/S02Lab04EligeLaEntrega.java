public class S02Lab04EligeLaEntrega {
    public static void main(String[] args) {
        String tipoEntrega = "EXPRESS";

        // TODO 1: Resolver ESTANDAR=500, EXPRESS=1200 y RECOGIDA=0 centavos con switch.
        int costo = 0;
        switch (tipoEntrega) {
            case "ESTANDAR":
                costo = 500;
                System.out.println("Costo (centavos): " + costo);
                break;
            case "EXPRESS":
                costo = 1200;
                System.out.println("Costo (centavos): " + costo);
                break;
            case "RECOGIDA":
                costo = 0;
                System.out.println("Costo (centavos): " + costo);
                break;
            default:
                // TODO 2: Manejar default como opción inválida; no mostrar un costo válido.
                System.out.println("Tipo de entrega invalido");
                return;
        }
        // TODO 3: En opciones válidas mostrar "Costo (centavos): " con el valor.
        
        // TODO 4: Usar un ternario para elegir "Retiro en tienda" o "Entrega a domicilio".
        String mensajeEntrega = (tipoEntrega.equals("RECOGIDA")) ? "Retiro en tienda" : "Entrega a domicilio";
        System.out.println("Etiqueta: " + mensajeEntrega);
        // TODO 5: Mostrar la etiqueta con "Etiqueta: "; para invalidos mostrar solo
        // "Tipo de entrega invalido".
        // TODO 6: Probar los tres tipos y DRON; opcionalmente comparar switch clásico y moderno
        // en tu copia personal. Entregar una versión y explicar break y las flechas.
        
    }
}
