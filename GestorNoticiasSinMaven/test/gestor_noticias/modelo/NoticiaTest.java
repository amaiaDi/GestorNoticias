package gestor_noticias.modelo;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

/**
 * @author icjardin
 *
 */
public class NoticiaTest {

    /**
     * testConstructorYGetters
     */
    @Test
    public void testConstructorYGetters() {
        LocalDate fecha = LocalDate.of(2023, 1, 1);
        Noticia noticia = new Noticia("Título", "Contenido", "Autor", fecha);

        assertEquals("Título", noticia.getTitulo());
        assertEquals("Contenido", noticia.getContenido());
        assertEquals("Autor", noticia.getAutor());
        assertEquals(fecha, noticia.getFechaPublicacion());
    }

    /**
     * testSetters
     */
    @Test
    public void testSetters() {
        Noticia noticia = new Noticia("", "", "", LocalDate.now());
        noticia.setTitulo("Nuevo título");
        noticia.setContenido("Nuevo contenido");
        noticia.setAutor("Nuevo autor");
        LocalDate nuevaFecha = LocalDate.of(2024, 6, 1);
        noticia.setFechaPublicacion(nuevaFecha);

        assertEquals("Nuevo título", noticia.getTitulo());
        assertEquals("Nuevo contenido", noticia.getContenido());
        assertEquals("Nuevo autor", noticia.getAutor());
        assertEquals(nuevaFecha, noticia.getFechaPublicacion());
    }

    /**
     * testToString
     */
    @Test
    public void testToString() {
        Noticia noticia = new Noticia("Título", "Contenido", "Autor", LocalDate.of(2024, 1, 1));
        assertTrue(noticia.toString().contains("Título"));
    }
}


