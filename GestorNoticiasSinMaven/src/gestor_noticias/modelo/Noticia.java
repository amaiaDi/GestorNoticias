package gestor_noticias.modelo;

import java.time.LocalDate;

/**
 * @author icjardin
 *
 */
public class Noticia {
	
    private String titulo;
    private String contenido;
    private String autor;
    private LocalDate fechaPublicacion;
    
	
    /**
     * @param titulo
     * @param contenido
     * @param autor
     * @param fechaPublicacion
     */
    public Noticia(String titulo, String contenido, String autor, LocalDate fechaPublicacion) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
	}


	/**
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return
	 */
	public String getContenido() {
		return contenido;
	}


	/**
	 * @param contenido
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	/**
	 * @return
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}


	/**
	 * @return
	 */
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}


	/**
	 * @param fechaPublicacion
	 */
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}


	/**
	 *
	 */
	@Override
	public String toString() {
		return "Noticia [titulo=" + titulo + ", contenido=" + contenido + ", autor=" + autor + ", fechaPublicacion="
				+ fechaPublicacion + "]";
	}
    
    
    
    
}
