package gestor_noticias;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import gestor_noticias.modelo.Noticia;
import gestor_noticias.servicio.GestorNoticias;

public class MainTest {

    /**
     * @throws Exception
     */
    @Test
    public void testCrearNoticiaMedianteReflection() throws Exception {
        // Simulamos entrada por consola:
        String input = "Título de prueba\nContenido de prueba\nAutor Prueba\n01/01/2024\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Creamos un gestor para pasar como argumento
        GestorNoticias gestor = new GestorNoticias();

        // Usamos reflection para acceder al método private static crearNoticia
        Method metodo = Main.class.getDeclaredMethod("crearNoticia", GestorNoticias.class);
        metodo.setAccessible(true);  // Hacemos el método accesible
        metodo.invoke(null, gestor); // null porque es static

        // Verificamos que se ha añadido una noticia
        List<Noticia> noticias = gestor.getNoticias();
        assertEquals(1, noticias.size());

        Noticia noticia = noticias.get(0);
        assertEquals("Título de prueba", noticia.getTitulo());
        assertEquals("Contenido de prueba", noticia.getContenido());
        assertEquals("Autor Prueba", noticia.getAutor());
        assertEquals(LocalDate.of(2024, 1, 1), noticia.getFechaPublicacion());
    }
    
    @Test
    public void testEliminarNoticiaMedianteReflection() throws Exception {
        // Preparamos el gestor con una noticia
        GestorNoticias gestor = new GestorNoticias();
        gestor.agregarNoticia(new Noticia("Eliminar Esto", "Texto", "Autor", LocalDate.now()));

        // Simulamos entrada: título a eliminar
        String entrada = "Eliminar Esto\n";
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));

        // Invocamos el método privado eliminarNoticia()
        Method metodo = Main.class.getDeclaredMethod("eliminarNoticia", GestorNoticias.class);
        metodo.setAccessible(true);
        metodo.invoke(null, gestor);

        // Verificamos que no queda ninguna noticia
        assertTrue(gestor.getNoticias().isEmpty());
    }
}

