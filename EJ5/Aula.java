
public class Aula{
	protected int ID;
	protected int max;
	protected String materia;
	protected boolean dispAula;
	
	public Aula(int ID, int max, String materia) {
		this.ID=ID;
		this.max=max;
		this.materia=materia;
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
}
