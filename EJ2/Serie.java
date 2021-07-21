
public class Serie implements Entregable {
	protected String titulo;
	protected int numTemporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	public Serie() {
		this.titulo="";
		this.numTemporadas=3;
		this.entregado=false;
		this.genero="";
		this.creador="";
	}
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.numTemporadas=3;
		this.entregado=false;
		this.genero="";
		this.creador=creador;
	}
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo=titulo;
		this.numTemporadas=numTemporadas;
		this.entregado=false;
		this.genero=genero;
		this.creador=creador;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumTemporadas() {
		return numTemporadas;
	}
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
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
		Serie array=new Serie();
		a=array;
		if(numTemporadas>array.getNumTemporadas()) {
			return true;
		}
		return false;
	}
	
}
