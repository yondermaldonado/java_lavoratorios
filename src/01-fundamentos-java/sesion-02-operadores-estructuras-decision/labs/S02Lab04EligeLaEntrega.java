public class S02Lab04EligeLaEntrega {
    public static void main(String[] args) {
        String tipoEntrega = "EXPRESS";

        // TODO 1: Resolver ESTANDAR=500, EXPRESS=1200 y RECOGIDA=0 centavos con switch.
        long costoCentavos;
        switch (tipoEntrega) {
            case "ESTANDAR":
                costoCentavos = 500;
                break;
            case "EXPRESS":
                costoCentavos = 1200;
                break;
            case "RECOGIDA":
                costoCentavos = 0;
                break;
            default:
                // TODO 2: Manejar default como opción inválida; no mostrar un costo válido.
                costoCentavos = -1; // señal interna de opción desconocida
        }

        if (costoCentavos < 0) {
            // TODO 5: para inválidos mostrar solo "Tipo de entrega invalido".
            System.out.println("Tipo de entrega invalido");
        } else {
            // TODO 3: En opciones válidas mostrar "Costo (centavos): " con el valor.
            System.out.println("Costo (centavos): " + costoCentavos);

            // TODO 4: Usar un ternario para elegir "Retiro en tienda" o "Entrega a domicilio".
            String etiqueta = tipoEntrega.equals("RECOGIDA") ? "Retiro en tienda" : "Entrega a domicilio";

            // TODO 5: Mostrar la etiqueta con "Etiqueta: ".
            System.out.println("Etiqueta: " + etiqueta);
        }

        // TODO 6: Probar los tres tipos y DRON; entregar una versión y explicar break y las flechas.
        // | tipoEntrega | Salida                                                 |
        // | ESTANDAR    | Costo (centavos): 500 / Etiqueta: Entrega a domicilio  |
        // | EXPRESS     | Costo (centavos): 1200 / Etiqueta: Entrega a domicilio |
        // | RECOGIDA    | Costo (centavos): 0 / Etiqueta: Retiro en tienda       |
        // | DRON        | Tipo de entrega invalido                               |
        //
        // break: en el switch clásico, sin break Java sigue ejecutando los case
        // siguientes (fall-through); break sale del switch al terminar el caso.
        // Las flechas (case "X" -> ...) del switch moderno ejecutan solo su rama,
        // así que no necesitan break.
    }
}