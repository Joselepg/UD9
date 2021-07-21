
public class Alumno extends Persona  {

	protected double nota;
	protected boolean asisAlumno;
	
	public Alumno(String nombre, int edad, String sexo, Double nota) {
		super(nombre, edad, sexo);
		this.nota = nota;
		asistenciaAlumno();
	}
	public void asistenciaAlumno() {
		int i=((int)(Math.random()*2 + 1));
		if(i==1) {
			this.asisAlumno=false;
		}else {
			this.asisAlumno=true;
		}
	}
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public boolean isAsisAlumno() {
		return asisAlumno;
	}

	public void setAsisAlumno(boolean asisAlumno) {
		this.asisAlumno = asisAlumno;
	}

}
