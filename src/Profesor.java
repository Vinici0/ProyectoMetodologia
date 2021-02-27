import javax.swing.JOptionPane;

public final class Profesor extends Persona {
	
	private String cedula;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Profesor(String nombre, String apellido, String domicilio, int edad) {
		super(nombre, apellido, domicilio, edad);
		
	}
	
	
	public void mostrarDatos() {
		JOptionPane.showMessageDialog(null, "Profesor \nNombre: " + getNombre() + " " + getApellido() + "\nDomicilio: "
				+ getDomicilio() + "\nEdad: " + getEdad() + "\nCedula: " + getCedula());
	}
	

}
