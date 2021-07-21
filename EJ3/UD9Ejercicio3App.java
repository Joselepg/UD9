import javax.swing.JOptionPane;

public class UD9Ejercicio3App {

	public static void Relleno(Libro[]arrayLibro) {
		arrayLibro[0]=new Libro("6542-456","Titulo1","Autor1",157);
		arrayLibro[1]=new Libro("7842-159","Titulo2","Autor2",194);		
	}
	public static void Mayor(Libro[]arrayLibro) {
		int mayor=0;
		for(int i=0;i<arrayLibro.length;i++) {
			if(arrayLibro[i].getPaginas()>mayor) {
				mayor=arrayLibro[i].getPaginas();
			}
		}
		for(int j=0;j<arrayLibro.length;j++) {
			if(arrayLibro[j].getPaginas()==mayor) {
				JOptionPane.showMessageDialog(null,
						"El libro con mas paginas es " + (arrayLibro[j].toString()));
			}
		}
	}
	public static void main(String[] args) {
		Libro[] arrayLibro = new Libro[2];
		Relleno(arrayLibro);
		Mayor(arrayLibro);
		
	}

}
