
public class Pelicula {
	protected String titulo;
	protected int duracion;
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMin() {
		return edadMin;
	}

	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	protected int edadMin;
	protected String director;
	
	public Pelicula(String titulo, int duracion, int edadMin, String director) {
		this.titulo=titulo;
		this.duracion=duracion;
		this.edadMin=edadMin;
		this.director=director;
	}
	public Pelicula() {
		this.titulo="titulo";
		this.director="director";
		this.edadMin=12;
		this.duracion=90;
	}
}
