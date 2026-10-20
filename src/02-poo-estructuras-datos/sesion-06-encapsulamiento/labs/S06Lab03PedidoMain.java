public class S06Lab03PedidoMain {
    public static void main(String[] args) {
        // TODO 6: Crear primerPedido y segundoPedido; mostrar el estado inicial de ambos.

        S06Pedido pedido1 = new S06Pedido();
        S06Pedido pedido2 = new S06Pedido();

        // TODO 7: Enviar primerPedido y luego intentar cancelarlo; consultar tras cada accion.

        System.out.println("Enviar pedido1: " + pedido1.enviar());
        System.out.println("Estado pedido1: " + pedido1.getEstado());
        System.out.println("Cancelar pedido1: " + pedido1.cancelar());
        System.out.println("Estado pedido1: " + pedido1.getEstado());

        // TODO 8: Cancelar segundoPedido y luego intentar enviarlo; consultar tras cada accion.

        System.out.println("Cancelar pedido2: " + pedido2.cancelar());
        System.out.println("Estado pedido2: " + pedido2.getEstado());
        System.out.println("Enviar pedido2: " + pedido2.enviar());
        System.out.println("Estado pedido2: " + pedido2.getEstado());

    }
}
