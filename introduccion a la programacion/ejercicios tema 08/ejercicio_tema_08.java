public class ejercicio_tema_08 {

	public static void main (String[] args) {
	Persona persona = new Persona();

	persona.setEdad(33);
	persona.setNombre("Pepa Flores");
	persona.setTelefono(555666777);

	System.out.println(persona.getNombre() + "\n" + persona.getEdad() + "\n" + persona.getTelefono());
	}
}

class Persona {
	private int edad;
	private String nombre;
	private int telefono;

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getTelefono() {
		return this.telefono;
	}
}
