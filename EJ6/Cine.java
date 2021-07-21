
public class Cine {
	protected String nombre;
	protected double precio;
	
	public Cine(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	public Cine() {
		this.nombre="nombre";
		this.precio=10;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
