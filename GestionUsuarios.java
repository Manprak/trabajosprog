import java.sql.*;
import java.util.Scanner;

public class GestionUsuarios {

    private static final String URL = "jdbc:mysql://localhost:3306/gestion_usuarios";
    private static final String USER = "root";
    private static final String PASSWORD = "tu_contraseña";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Añadir Usuario");
            System.out.println("2. Eliminar Usuario");
            System.out.println("3. Actualizar Usuario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    añadirUsuario(scanner);
                    break;
                case 2:
                    eliminarUsuario(scanner);
                    break;
                case 3:
                    actualizarUsuario(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void añadirUsuario(Scanner scanner) {
        System.out.print("Introduce el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el email del usuario: ");
        String email = scanner.nextLine();

        String query = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";

        try (Connection conn = obtenerConexion(); 
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setString(2, email);
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Usuario añadido exitosamente.");
            }
        } catch (SQLException e) {
            System.out.println("Error al añadir el usuario: " + e.getMessage());
        }
    }

    public static void eliminarUsuario(Scanner scanner) {
        System.out.print("Introduce el ID del usuario a eliminar: ");
        int id = scanner.nextInt();

        String query = "DELETE FROM usuarios WHERE id = ?";

        try (Connection conn = obtenerConexion(); 
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Usuario eliminado exitosamente.");
            } else {
                System.out.println("No se encontró un usuario con ese ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el usuario: " + e.getMessage());
        }
    }

    public static void actualizarUsuario(Scanner scanner) {
        System.out.print("Introduce el ID del usuario a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Introduce el nuevo nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el nuevo email del usuario: ");
        String email = scanner.nextLine();

        String query = "UPDATE usuarios SET nombre = ?, email = ? WHERE id = ?";

        try (Connection conn = obtenerConexion(); 
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setString(2, email);
            stmt.setInt(3, id);
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Usuario actualizado exitosamente.");
            } else {
                System.out.println("No se encontró un usuario con ese ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar el usuario: " + e.getMessage());
        }
    }
}
