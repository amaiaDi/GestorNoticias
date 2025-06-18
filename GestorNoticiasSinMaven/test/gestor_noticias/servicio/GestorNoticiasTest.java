package gestor_noticias.servicio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import gestor_noticias.modelo.Noticia;

public class GestorNoticiasTest {

    /**
     * testAgregarYListarNoticias
     */
    @Test
    public void testAgregarYListarNoticias() {
        GestorNoticias gestor = new GestorNoticias();
        Noticia noticia = new Noticia("Test", "Contenido", "Autor", LocalDate.now());

        gestor.agregarNoticia(noticia);
        List<Noticia> noticias = gestor.getNoticias();

        assertEquals(1, noticias.size());
        assertEquals("Test", noticias.get(0).getTitulo());
    }

    /**
     * testEliminarNoticiaPorTitulo
     */
    @Test
    public void testEliminarNoticiaPorTitulo() {
        GestorNoticias gestor = new GestorNoticias();
        gestor.agregarNoticia(new Noticia("Test", "C", "A", LocalDate.now()));

        boolean eliminado = gestor.eliminarNoticiaPorTitulo("Test");
        assertTrue(eliminado);
        assertTrue(gestor.getNoticias().isEmpty());
    }

    /**
     * testEliminarNoticiaNoExistente
     */
    @Test
    public void testEliminarNoticiaNoExistente() {
        GestorNoticias gestor = new GestorNoticias();
        gestor.agregarNoticia(new Noticia("Existente", "C", "A", LocalDate.now()));

        boolean eliminado = gestor.eliminarNoticiaPorTitulo("Inexistente");
        assertFalse(eliminado);
        assertEquals(1, gestor.getNoticias().size());
    }
}
