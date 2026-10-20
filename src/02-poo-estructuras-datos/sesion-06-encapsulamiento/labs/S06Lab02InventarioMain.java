public class S06Lab02InventarioMain {
    public static void main(String[] args) {
        // TODO 6: Crear un inventario y mostrar sus existencias iniciales.

        S06Inventario inventario1 = new S06Inventario();
        S06Inventario inventario2 = new S06Inventario();

        // TODO 7: Ingresar 10, retirar 11 y retirar 10; mostrar resultado y existencias tras cada accion.

        System.out.println("inventario1 ingreso 10: " + inventario1.ingresar(10));
        System.out.println("inventario1 retiro 11: " + inventario1.retirar(11));

        System.out.println("inventario2 ingreso 10: " + inventario2.ingresar(10));
        System.out.println("inventario2 retiro 11: " + inventario2.retirar(11));

        // TODO 8: Intentar ingresar 0 y 101; mostrar resultado y existencias tras cada accion.

        System.out.println("inventario1 ingreso 0: " + inventario1.ingresar(0));
        System.out.println("inventario1 ingreso 101: " + inventario1.ingresar(101));

        System.out.println("inventario2 ingreso 0: " + inventario2.ingresar(0));
        System.out.println("inventario2 ingreso 101: " + inventario2.ingresar(101));
    }
}
