
public class Videojuego implements Entregable{
	protected String titulo;
	protected double horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compañia;
	
	public Videojuego() {
		this.titulo="";
		this.horasEstimadas=10;
		this.entregado=false;
		this.genero="";
		this.compañia="";
	}
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.entregado=false;
		this.genero="";
		this.compañia="";
	}
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.entregado=false;
		this.genero=genero;
		this.compañia=compañia;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(double horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}
	@Override
	public void Entregar() {
		entregado=true;
		
	}
	@Override
	public void Devolver() {
		entregado=false;
		
	}
	@Override
	public boolean isEntregado() {
		return entregado;
	}
	@Override
	public boolean compareTo(Object a) {
		Videojuego array=new Videojuego();
		a=array;
		if(horasEstimadas>array.getHorasEstimadas()) {
			return true;
		}
		return false;
	}
	
}
