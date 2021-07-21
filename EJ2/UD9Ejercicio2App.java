import javax.swing.JOptionPane;

public class UD9Ejercicio2App {
	public static void Relleno(Videojuego[] arrayJ, Serie[] arrayS) {
		arrayJ[0] = new Videojuego("titulo1", 12, "genero1", "compañia1");
		arrayJ[1] = new Videojuego("titulo2", 4, "genero2", "compañia2");
		arrayJ[2] = new Videojuego("titulo3", 28, "genero3", "compañia3");
		arrayJ[3] = new Videojuego("titulo4", 1, "genero4", "compañia4");
		arrayJ[4] = new Videojuego("titulo5", 2, "genero5", "compañia5");

		arrayS[0] = new Serie("titulo1", 2, "genero1", "creador1");
		arrayS[1] = new Serie("titulo2", 1, "genero2", "creador2");
		arrayS[2] = new Serie("titulo3", 3, "genero3", "creador3");
		arrayS[3] = new Serie("titulo4", 5, "genero4", "creador4");
		arrayS[4] = new Serie("titulo5", 4, "genero5", "creador5");

		arrayJ[2].Entregar();
		arrayJ[4].Entregar();
		arrayS[1].Entregar();
		arrayS[3].Entregar();
		arrayS[0].Entregar();
	}

	public static void ContarEntregas(Videojuego[] arrayJ, Serie[] arrayS) {
		int contadorJ = 0;
		int contadorS = 0;
		for (int i = 0; i < arrayJ.length; i++) {
			if (arrayJ[i].isEntregado()) {
				contadorJ++;
				arrayJ[i].isEntregado();
			} else {
				arrayJ[i].Devolver();
			}
		}
		for (int i = 0; i < arrayJ.length; i++) {
			if (arrayS[i].isEntregado()) {
				contadorS++;
				arrayS[i].isEntregado();
			} else {
				arrayS[i].Devolver();
			}
		}

	}

	public static void Mayor(Videojuego[] arrayJ, Serie[] arrayS) {
		double mayorJ = 0;
		int mayorS = 0;
		for (int i = 0; i < arrayJ.length; i++) {
			if ((arrayJ[i].getHorasEstimadas()) > mayorJ) {
				mayorJ = arrayJ[i].getHorasEstimadas();
			}
		}
			for (int j = 0; j < arrayJ.length; j++) {
				if ((arrayJ[j].getHorasEstimadas()) == mayorJ) {
					JOptionPane.showMessageDialog(null,
							"El juego con mas horas estimadas es: " + (arrayJ[j].toString()));
				}
			}
			for (int x = 0; x < arrayS.length; x++) {
				if ((arrayS[x].getNumTemporadas()) > mayorS) {
					mayorS = arrayS[x].getNumTemporadas();

				}
			}
				for (int j = 0; j < arrayS.length; j++) {
					if ((arrayS[j].getNumTemporadas()) == mayorS) {
						JOptionPane.showMessageDialog(null,
								"La serie con mas temporadas es: " + (arrayS[j].toString()));
					}
				}
			}
	

	public static void main(String[] args) {
		Videojuego[] arrayVideojuegos = new Videojuego[5];
		Videojuego J = new Videojuego();
		Serie[] arraySerie = new Serie[5];
		Serie S = new Serie();

		Relleno(arrayVideojuegos, arraySerie);
		Mayor(arrayVideojuegos, arraySerie);
		ContarEntregas(arrayVideojuegos, arraySerie);
	}

}
