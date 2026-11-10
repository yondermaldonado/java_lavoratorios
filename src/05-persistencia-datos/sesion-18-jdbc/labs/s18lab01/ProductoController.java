package s18lab01;

import java.sql.SQLException;

public class ProductoController {
    private final VistaInventario vista;
    private final ProductoDAO dao;

    public ProductoController(VistaInventario vista, ProductoDAO dao) {
        this.vista = vista;
        this.dao = dao;
    }

    public void iniciar() {
        while (true) {
            String opcion = vista.pedirOpcion();
            try {
                switch (opcion) {
                    case "1":
                        String nombre = vista.leerTexto("Nombre: ");
                        int stock = vista.leerEntero("Stock: ");
                        Producto nuevo = new Producto(0, nombre, stock);
                        vista.mostrar("Filas insertadas: " + dao.registrar(nuevo));
                        break;
                    case "2":
                        vista.mostrarListado(dao.listar());
                        break;
                    case "3":
                        int id = leerId();
                        // Se validan las reglas del modelo antes de enviar el cambio.
                        int nuevoStock = Producto.validarStock(vista.leerEntero("Nuevo stock: "));
                        informarCambio(dao.actualizarStock(id, nuevoStock));
                        break;
                    case "0":
                        return;
                    default:
                        vista.mostrar("Opcion no valida.");
                }
            } catch (SQLException error) {
                vista.mostrar("Operacion JDBC no completada. SQLState: " + error.getSQLState()
                        + "; codigo: " + error.getErrorCode());
            } catch (IllegalArgumentException error) {
                vista.mostrar(error.getMessage());
            }
        }
    }

    private int leerId() {
        int id = vista.leerEntero("Id: ");
        if (id <= 0) {
            throw new IllegalArgumentException("El id debe ser positivo.");
        }
        return id;
    }

    private void informarCambio(int filas) {
        vista.mostrar(filas == 0 ? "Sin coincidencias para ese id." : "Filas afectadas: " + filas);
    }
}
