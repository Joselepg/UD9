
public class Libro {
	protected String ISBN;
	protected String Titulo;
	protected String Autor;
	protected int Paginas;
	public  Libro(String ISBN, String Titulo, String Autor, int Paginas){
		this.ISBN=ISBN;
		this.Titulo=Titulo;
		this.Autor=Autor;
		this.Paginas=Paginas;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getPaginas() {
		return Paginas;
	}
	public void setPaginas(int paginas) {
		Paginas = paginas;
	}
	@Override
	public String toString() {
		return "el Libro con ISBN-" + ISBN + " creado por el autor: " + Autor + " tiene " + Paginas + " paginas.";
	}
	
}
