import javax.swing.JOptionPane;

public final class Alumno extends Persona {

	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Alumno(String nombre, String apellido, String domicilio, int edad, String matricula) {
		super(nombre, apellido, domicilio, edad);
	}

	public void mostrarDatos() {
		JOptionPane.showConfirmDialog(null, "ALUMNO \nNombre: " + getNombre() + " " + getApellido() + "\nDomicilio: "
				+ getDomicilio() + "\nEdad: " + getEdad() + "\nMatricula: " + getMatricula());
	}

}
