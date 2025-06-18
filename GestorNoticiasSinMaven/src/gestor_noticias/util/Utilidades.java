package gestor_noticias.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Utilidades {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /**
     * Pide al usuario una línea de texto con un mensaje.
     */
    public static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    /**
     * Pide al usuario una fecha con formato dd/MM/yyyy.
     */
    public static LocalDate leerFecha(String mensaje) {
        while (true) {
            System.out.print(mensaje + " (formato dd/MM/yyyy): ");
            String input = scanner.nextLine();
            try {
                return LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Fecha no válida. Intenta de nuevo.");
            }
        }
    }

    /**
     * Muestra una línea separadora.
     */
    public static void mostrarSeparador() {
        System.out.println("--------------------------------------------------");
    }

    /**
     * Pausa la ejecución hasta que el usuario pulse Enter.
     */
    public static void pausar() {
        System.out.println("\nPulsa ENTER para continuar...");
        scanner.nextLine();
    }
}
