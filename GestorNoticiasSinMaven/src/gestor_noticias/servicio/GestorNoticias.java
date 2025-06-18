package gestor_noticias.servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import gestor_noticias.modelo.Noticia;

/**
 * @author icjardin
 *
 */
public class GestorNoticias {
    
	private final List<Noticia> noticias = new ArrayList<>();

    /**
     * @param noticia
     */
    public void agregarNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    /**
     * 
     */
    public void listarNoticias() {
        if (noticias.isEmpty()) {
            System.out.println("No hay noticias disponibles.");
            return;
        }

        for (Noticia noticia : noticias) {
            System.out.println(noticia);
            System.out.println("---------------------------------------------");
        }
    }

    /**
     * @param titulo
     * @return
     */
    public boolean eliminarNoticiaPorTitulo(String titulo) {
        Iterator<Noticia> it = noticias.iterator();
        while (it.hasNext()) {
            if (it.next().getTitulo().equalsIgnoreCase(titulo)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * @return
     */
    public List<Noticia> getNoticias() {
        return noticias;
    }
    

	/**
	 *
	 */
	@Override
	public String toString() {
		return "GestorNoticias [noticias=" + noticias + "]";
	}
    
    
}
