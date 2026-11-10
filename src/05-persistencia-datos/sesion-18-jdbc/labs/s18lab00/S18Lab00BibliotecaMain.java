package s18lab00;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class S18Lab00BibliotecaMain {
    private static final String URL = "jdbc:mysql://localhost:3306/campus_java_s18";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Campus2023!";

    public static void main(String[] args) {
        try {
/*            String url = System.getenv("DB_URL");
            String usuario = System.getenv("DB_USER");
            String clave = System.getenv("DB_PASSWORD");*/
            if (URL == null || URL.isBlank() || DB_USER == null || DB_USER.isBlank() || DB_PASSWORD == null) {
                throw new IllegalArgumentException("Configura DB_URL, DB_USER y DB_PASSWORD en IntelliJ.");
            }
            try (Connection conexion = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
                 Scanner entrada = new Scanner(System.in)) {
                if (!conexion.isValid(5)) {
                    throw new SQLException("Conexion no valida");
                }
                System.out.println("Conexion comprobada");
                ejecutarMenu(conexion, entrada);
            }
        } catch (SQLException error) {
            mostrarError(error);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }

    private static void ejecutarMenu(Connection conexion, Scanner entrada) {
        while (true) {
            System.out.println("1 Registrar | 2 Listar | 3 Buscar por ISBN | 4 Eliminar | 0 Salir");
            if (!entrada.hasNextLine()) {
                return;
            }
            String opcion = entrada.nextLine().strip();
            try {
                switch (opcion) {
                    case "1":
                        String titulo = obligatorio(leer(entrada, "Titulo: "), 150);
                        String isbn = obligatorio(leer(entrada, "ISBN: "), 20);
                        System.out.println("Filas insertadas: " + registrar(conexion, titulo, isbn));
                        break;
                    case "2":
                        listar(conexion);
                        break;
                    case "3":
                        String isbnBuscado = obligatorio(leer(entrada, "ISBN a buscar: "), 20);
                        buscar(conexion, isbnBuscado);
                        break;
                    case "4":
                        int idEliminar = leerId(entrada);
                        if (leer(entrada, "Escribe SI para eliminar: ").equals("SI")) {
                            informarCambio(eliminar(conexion, idEliminar));
                        } else {
                            System.out.println("Eliminacion cancelada.");
                        }
                        break;
                    case "0":
                        return;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } catch (SQLException error) {
                mostrarError(error);
            } catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            }
        }
    }

    public static int registrar(Connection conexion, String titulo, String isbn) throws SQLException {
        try (PreparedStatement sentencia = conexion.prepareStatement(
                "INSERT INTO libros (titulo, isbn) VALUES (?, ?)")) {
            sentencia.setString(1, titulo);
            sentencia.setString(2, isbn);
            return sentencia.executeUpdate();
        }
    }

    public static void listar(Connection conexion) throws SQLException {
        try (PreparedStatement sentencia = conexion.prepareStatement(
                "SELECT id, titulo, isbn FROM libros ORDER BY id");
             ResultSet resultado = sentencia.executeQuery()) {
            boolean hayLibros = false;
            while (resultado.next()) {
                hayLibros = true;
                System.out.println(resultado.getInt("id") + " | " + resultado.getString("titulo")
                        + " | " + resultado.getString("isbn"));
            }
            if (!hayLibros) {
                System.out.println("Sin libros.");
            }
        }
    }

    public static void buscar(Connection conexion, String isbn) throws SQLException {
        try (PreparedStatement sentencia = conexion.prepareStatement(
                "SELECT id, titulo, isbn FROM libros WHERE isbn = ?")) {
            sentencia.setString(1, isbn);
            try (ResultSet resultado = sentencia.executeQuery()) {
                if (resultado.next()) {
                    System.out.println(resultado.getInt("id") + " | " + resultado.getString("titulo")
                            + " | " + resultado.getString("isbn"));
                } else {
                    System.out.println("Sin resultados.");
                }
            }
        }
    }

    public static int eliminar(Connection conexion, int id) throws SQLException {
        try (PreparedStatement sentencia = conexion.prepareStatement("DELETE FROM libros WHERE id = ?")) {
            sentencia.setInt(1, id);
            return sentencia.executeUpdate();
        }
    }

    private static void informarCambio(int filas) {
        System.out.println(filas == 0 ? "Sin coincidencias para ese id." : "Filas afectadas: " + filas);
    }

    private static void mostrarError(SQLException error) {
        if (error.getErrorCode() == 1062) {
            System.out.println("Error: ya existe un libro con ese ISBN.");
        } else {
            System.out.println("Operacion JDBC no completada. SQLState: " + error.getSQLState()
                    + "; codigo: " + error.getErrorCode());
        }
    }

    private static String leer(Scanner entrada, String etiqueta) {
        System.out.print(etiqueta);
        if (!entrada.hasNextLine()) {
            throw new IllegalArgumentException("Entrada finalizada. Ejecuta de nuevo para continuar.");
        }
        return entrada.nextLine().strip();
    }

    private static int leerId(Scanner entrada) {
        int id = Integer.parseInt(leer(entrada, "Id: "));
        if (id <= 0) {
            throw new IllegalArgumentException("El id debe ser positivo.");
        }
        return id;
    }

    private static String obligatorio(String valor, int maximo) {
        String limpio = valor.strip();
        if (limpio.isEmpty() || limpio.length() > maximo) {
            throw new IllegalArgumentException("Texto obligatorio; maximo " + maximo + " caracteres.");
        }
        return limpio;
    }
}