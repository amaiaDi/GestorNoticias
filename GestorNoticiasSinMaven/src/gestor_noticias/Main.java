package gestor_noticias;

import java.time.LocalDate;

import gestor_noticias.modelo.Noticia;
import gestor_noticias.servicio.GestorNoticias;
import gestor_noticias.util.Utilidades;

public class Main {

    public static void main(String[] args) {
        GestorNoticias gestor = new GestorNoticias();
        int opcion=0;

        do {
            Utilidades.mostrarSeparador();
            System.out.println("GESTOR DE NOTICIAS");
            Utilidades.mostrarSeparador();
            System.out.println("1. Crear noticia");
            System.out.println("2. Listar noticias");
            System.out.println("3. Eliminar noticia por título");
            System.out.println("4. Salir");
            Utilidades.mostrarSeparador();

            String entrada = Utilidades.leerCadena("Elige una opción: ");
            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Introduce un número.");
                continue;
            }

            switch (opcion) {
                case 1 -> crearNoticia(gestor);
                case 2 -> gestor.listarNoticias();
                case 3 -> eliminarNoticia(gestor);
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no reconocida.");
            }

            if (opcion != 4) {
                Utilidades.pausar();
            }

        } while (opcion != 4);
    }

    private static void crearNoticia(GestorNoticias gestor) {
        String titulo = Utilidades.leerCadena("Título: ");
        String contenido = Utilidades.leerCadena("Contenido: ");
        String autor = Utilidades.leerCadena("Autor: ");
        LocalDate fecha = Utilidades.leerFecha("Fecha de publicación");

        Noticia noticia = new Noticia(titulo, contenido, autor, fecha);
        gestor.agregarNoticia(noticia);
        System.out.println("✅ Noticia añadida correctamente.");
    }

    private static void eliminarNoticia(GestorNoticias gestor) {
        String titulo = Utilidades.leerCadena("Introduce el título de la noticia a eliminar: ");
        boolean eliminado = gestor.eliminarNoticiaPorTitulo(titulo);
        if (eliminado) {
            System.out.println("✅ Noticia eliminada.");
        } else {
            System.out.println("❌ No se encontró ninguna noticia con ese título.");
        }
    }
}

