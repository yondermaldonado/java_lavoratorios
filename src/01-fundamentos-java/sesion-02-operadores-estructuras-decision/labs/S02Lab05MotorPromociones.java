public class S02Lab05MotorPromociones {
    public static void main(String[] args) {
        long subtotalCentavos = 18_500;
        int cantidad = 4;
        boolean esMiembro = true;
        String tipoEntrega = "EXPRESS";

        // TODO 1: Predecir descuento, importe neto, envío y total antes de programar.
        // Predicción: miembro y subtotal >= 10000 -> 10 %
        // Descuento: 18500 * 10 / 100 = 1850
        // Neto: 18500 - 1850 = 16650
        // Envío: EXPRESS = 1200
        // Total: 16650 + 1200 = 17850

        // TODO 2: Validar subtotal entre 0 y 1000000 inclusive y cantidad mayor que cero.
        boolean datosValidos = subtotalCentavos >= 0 && subtotalCentavos <= 1_000_000 && cantidad > 0;

        if (!datosValidos) {
            System.out.println("Pedido invalido: subtotal o cantidad fuera de rango");
        } else {
            // TODO 3: Rechazar entrega desconocida; no mostrar un desglose válido.
            long envioCentavos;
            switch (tipoEntrega) {
                case "ESTANDAR":
                    envioCentavos = 500;
                    break;
                case "EXPRESS":
                    envioCentavos = 1200;
                    break;
                case "RECOGIDA":
                    envioCentavos = 0;
                    break;
                default:
                    envioCentavos = -1;
            }

            if (envioCentavos < 0) {
                System.out.println("Pedido invalido: tipo de entrega desconocido");
            } else {
                // TODO 4: Elegir 10%, 5% o 0% con if/else if/else según las reglas del README.
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

                // TODO 6: Envío gratis solo para ESTANDAR cuando el neto alcanza 25000 centavos.
                if (tipoEntrega.equals("ESTANDAR") && netoCentavos >= 25_000) {
                    envioCentavos = 0;
                }
                long totalCentavos = netoCentavos + envioCentavos;

                // TODO 7: Mostrar el desglose con las etiquetas indicadas en el README.
                System.out.println("Subtotal (centavos): " + subtotalCentavos);
                System.out.println("Descuento (%): " + porcentajeDescuento);
                System.out.println("Descuento (centavos): " + descuentoCentavos);
                System.out.println("Neto (centavos): " + netoCentavos);
                System.out.println("Envio (centavos): " + envioCentavos);
                System.out.println("Total (centavos): " + totalCentavos);
            }
        }

        // TODO 8: Probar los cinco casos mínimos del README; registrar resultados.
        // | Subtotal | Cant | Miembro | Entrega  | Descuento | Neto  | Envío | Total |
        // | 18500    | 4    | true    | EXPRESS  | 1850      | 16650 | 1200  | 17850 |
        // | 26314    | 1    | false   | ESTANDAR | 1315      | 24999 | 500   | 25499 |
        // | 26315    | 1    | false   | ESTANDAR | 1315      | 25000 | 0     | 25000 |
        // cantidad = 0     -> Pedido invalido: subtotal o cantidad fuera de rango
        // tipoEntrega DRON -> Pedido invalido: tipo de entrega desconocido

        // TODO 9 (opcional): Inspeccionar con Debug descuentoCentavos, netoCentavos y envioCentavos.

        // TODO 10: Nombres revisados, reglas sin cambios.
        // El envío gratis depende del neto (no del subtotal) porque la promoción se
        // calcula sobre lo que el cliente paga después del descuento: en 26314 el neto
        // es 24999 (no llega a 25000) y paga envío; en 26315 el neto es 25000 y es gratis.
    }
}