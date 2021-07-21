
public class UD9Ejercicio5App {

	public static void Relleno(Alumno[]arrayAlumno, Profesor[]arrayProfesor, Aula[]arrayAula) {

		arrayAlumno[0]=new Alumno("Alumno1",16,"chico",6.4);
		arrayAlumno[1]=new Alumno("Alumno2",18,"chica",7.8);
		arrayAlumno[2]=new Alumno("Alumno3",17,"chico",4.8);
		arrayAlumno[3]=new Alumno("Alumno4",15,"chico",5.2);
		arrayAlumno[4]=new Alumno("Alumno5",16,"chica",8.3);
		arrayAlumno[4]=new Alumno("Alumno6",17,"chica",9.3);
		
		arrayProfesor[0]=new Profesor("Profesor1",43,"hombre","fisica");
		arrayProfesor[1]=new Profesor("Profesor2",38,"mujer","matematicas");
		arrayProfesor[2]=new Profesor("Profesor3",50,"hombre","filosofia");
		
		
		arrayAula[0]=new Aula(12,6,"filosofia");
		arrayAula[1]=new Aula(13,6,"matematicas");
		arrayAula[2]=new Aula(14,6,"fisica");
		
	}
	public static boolean Disponibilidad(Alumno[]arrayAlumno, Profesor[]arrayProfesor, Aula[]arrayAula) {
		int contadorDispo=0;
		boolean dispAula=false;
		for(int i=0;i<arrayAlumno.length;i++) {
			if(arrayAlumno[i].asisAlumno==true) {
				contadorDispo++;
			}
		}
		for(int i=0;i<arrayProfesor.length;i++) {
			if(contadorDispo>(arrayAlumno.length/2)&&arrayProfesor[i].asisProfe==true) {
				dispAula=true;
			}else {
				dispAula=false;
			}
		}
		return dispAula;
	}
	public static void Mostrar(Alumno[]arrayAlumno, Profesor[]arrayProfesor, Aula[]arrayAula) {
		int aprobados=0;
		int aprobadas=0;
		if(Disponibilidad(arrayAlumno, arrayProfesor, arrayAula)==true) {
			for(int i=0;i<arrayAlumno.length;i++) {
				if(arrayAlumno[i].nota>=5&&arrayAlumno[i].sexo=="chico") {
					aprobados++;
				}else if(arrayAlumno[i].nota>=5&&arrayAlumno[i].sexo=="chica") {
					aprobadas++;
				}
			}
			System.out.println("Han aprobado "+aprobados+" chicos."+"Han aprobado "+aprobadas+" chicas.");
		} else if(Disponibilidad(arrayAlumno, arrayProfesor, arrayAula)==false) {
			System.out.println("No hay clases.");
		}
		
	}
	public static void main(String[] args) {
		Alumno[] arrayAlumno=new Alumno[5];
		Profesor[] arrayProfesor=new Profesor[3];
		Aula[] arrayAula=new Aula[3];
		Relleno(arrayAlumno, arrayProfesor, arrayAula);
		Mostrar(arrayAlumno, arrayProfesor, arrayAula);
	}

}
