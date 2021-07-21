
public class Profesor extends Persona  {
	protected String materia;
	protected boolean asisProfe;
	
	public Profesor(String nombre, int edad, String sexo, String materia) {
		super(nombre,edad,sexo);
		this.materia=materia;
		asistenciaProfe();
	}
	public void asistenciaProfe() {
		int i=((int)(Math.random()*5 + 1));
		if(i==1) {
			this.asisProfe=false;
		}else {
			this.asisProfe=true;
		}
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public boolean isAsisProfe() {
		return asisProfe;
	}

	public void setAsisProfe(boolean asisProfe) {
		this.asisProfe = asisProfe;
	}
}