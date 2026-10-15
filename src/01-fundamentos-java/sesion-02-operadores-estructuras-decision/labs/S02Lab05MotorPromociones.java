public class S02Lab05MotorPromociones {
    public static void main(String[] args) {
        long subtotalCentavos = 18_500;
        int cantidad = 4;
        boolean esMiembro = true;
        String tipoEntrega = "EXPRESS";

        // TODO 1: Predecir descuento, importe neto, envío y total antes de programar.
        // Descuento: 10% (1850 centavos), Neto: 16650 centavos, Envío: 1200 centavos, Total: 17850 centavos
        // TODO 2: Validar subtotal entre 0 y 1000000 inclusive y cantidad mayor que cero.
        if (subtotalCentavos < 0 || subtotalCentavos > 1_000_000 || cantidad <= 0) {
            System.out.println("Subtotal o cantidad inválidos");
            return;
        }
        // TODO 3: Rechazar entrega desconocida; no mostrar un desglose válido.
        if (!tipoEntrega.equals("ESTANDAR") && !tipoEntrega.equals("EXPRESS") && !tipoEntrega.equals("RECOGIDA")) {
            System.out.println("Tipo de entrega invalido");
            return;
        }
        // TODO 4: Elegir 10%, 5% o 0% con if/else if/else según las reglas del README.
        //  Declara int porcentajeDescuento. Asígnale 10 si es miembro y subtotal>=10000; 5 si no es miembro y subtotal>=20000; 0 en cualquier otro caso. Usa if/else if/else, sin sumar tasas.
        int porcentajeDescuento;
        if (esMiembro && subtotalCentavos >= 10_000) {
            porcentajeDescuento = 10;
        } else if (!esMiembro && subtotalCentavos >= 20_000) {
            porcentajeDescuento = 5;
        } else {
            porcentajeDescuento = 0;
        }
        // TODO 5: Calcular descuento y neto en centavos; truncar fracciones de centavo.
        long descuentoCentavos = subtotalCentavos * porcentajeDescuento / 100;
        long netoCentavos = subtotalCentavos - descuentoCentavos;
        // TODO 6: Elegir costo de envío con switch y aplicar gratuidad solo al ESTANDAR
        
        // cuando el neto alcanza 25000 centavos.
        int envioCentavos;
        switch (tipoEntrega) {
            case "ESTANDAR":
                envioCentavos = (netoCentavos >= 25_000) ? 0 : 500;
                break;
            case "EXPRESS":
                envioCentavos = 1200;
                break;
            case "RECOGIDA":
                envioCentavos = 0;
                break;
            default:
                envioCentavos = 0;
        }
        // TODO 7: Mostrar el desglose con las etiquetas indicadas en el README.
        //En la rama de pedido válido agrega seis println en el orden y con las etiquetas del bloque esperado. Concatena cada etiqueta con su variable; no escribas importes fijos en la salida.
        System.out.println("Subtotal (centavos): " + subtotalCentavos);
        System.out.println("Descuento (centavos): " + descuentoCentavos);
        // TODO 8: Probar los cinco casos mínimos del README; registrar resultados.
        //| Subtotal | Cantidad | Miembro | Entrega | Descuento | Neto | Envío | Total |
        //| --- | --- | --- | --- | --- | --- | --- | --- |
        //| 18500 | 4 | true | EXPRESS | 1850 | 16650 | 1200 | 17850 |
        //| 26314 | 1 | false | ESTANDAR | 1315 | 24999 | 500 | 25499 |
        //| 26315 | 1 | false | ESTANDAR | 1315 | 25000 | 0 | 25000 |

        // TODO 9 (opcional): Inspeccionar con Debug descuentoCentavos, netoCentavos y envioCentavos.
        // TODO 10: Mejorar nombres y repetir las pruebas sin alterar las reglas.
        
    }
}
