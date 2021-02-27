
public class Herencia {

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno("Oscar", "Avellan", "Ecuador", 20);
		alumno.setMatricula("121545115");
		alumno.mostrarDatos();
		
		Profesor profesor = new Profesor("Vinicio","Borja","Ecuador",20);
		profesor.setCedula("1544815151");
		profesor.mostrarDatos();

	}

}
