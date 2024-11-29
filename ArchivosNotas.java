import java.io.*;
import java.util.*;

public class ArchivosNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = "notas.txt";
        List<String> notas = new ArrayList<>();

        System.out.println("Ingresa las notas. Escribe 'fin' para terminar.");
        while (true) {
            System.out.print("Nota: ");
            String nota = scanner.nextLine();
            if (nota.equalsIgnoreCase("fin")) {
                break;
            }
            notas.add(nota);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String nota : notas) {
                writer.write(nota);
                writer.newLine();
            }
            System.out.println("Notas guardadas en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar las notas: " + e.getMessage());
        }

        System.out.println("\nNotas guardadas:");
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer las notas: " + e.getMessage());
        }
    }
}
