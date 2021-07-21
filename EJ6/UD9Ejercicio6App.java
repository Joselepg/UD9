
public class UD9Ejercicio6App {

	public static void RellenoArray(Espectador[] arrayEspectador) {

		arrayEspectador[0] = new Espectador("nombre", 12, 20.5);
		arrayEspectador[1] = new Espectador("nombre2", 30, 10.5);
		arrayEspectador[2] = new Espectador("nombre3", 6, 2.5);
		arrayEspectador[3] = new Espectador("nombre4", 61, 5.5);
		arrayEspectador[4] = new Espectador("nombre5", 4, 7.5);
		arrayEspectador[5] = new Espectador("nombre6", 21, 16.5);
		arrayEspectador[6] = new Espectador("nombre7", 14, 49.5);
		arrayEspectador[7] = new Espectador("nombre8", 12, 27.5);
		arrayEspectador[8] = new Espectador("nombre9", 8, 70.5);
		arrayEspectador[9] = new Espectador("nombre10", 16, 21.5);
	}

	public static void RellenoAsiento(String asiento[][]) {
		int numLetra = 64;
		for (int i = 0; i < asiento.length; i++) {
			numLetra++;
			char letra = (char) numLetra;
			int num = 8;
			for (int j = 0; j < asiento[i].length; j++) {
				asiento[i][j] = String.valueOf(num) + (letra) + " ";
				num--;
			}
		}
	}

	public static void Sentar(String asiento[][], Espectador[]arrayEspectador, Pelicula pelicula, Cine cine) {
		for(int x=0;x<arrayEspectador.length;x++) {
			int iRandom=(int)(Math.random()*(8-0+1)+0);
			int jRandom=(int)(Math.random()*(7-0+1)+0);
			if(arrayEspectador[x].getDinero()>=cine.getPrecio()&&arrayEspectador[x].getEdad()>=pelicula.getEdadMin()) {
						asiento[iRandom][jRandom]+="X ";
			}
		}
	}

	public static void Mostrar(String asiento[][]) {

		for (int i = 0; i < asiento.length; i++) {
			for (int j = 0; j < asiento[i].length; j++) {
				System.out.print(asiento[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula();
		Cine cine = new Cine();
		String[][] asiento = new String[9][8];
		Espectador[] arrayEspectador = new Espectador[10];
		RellenoArray(arrayEspectador);
		RellenoAsiento(asiento);
		Sentar(asiento, arrayEspectador, pelicula, cine);
		Mostrar(asiento);
	}

}
