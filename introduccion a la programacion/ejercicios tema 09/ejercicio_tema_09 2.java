public class ejercicio_tema_09 {

	public static void main(String[] args){

		Cliente cliente = new Cliente();
        cliente.setNombre("Pepe");
        cliente.setEdad(25);
        cliente.setTelefono(555555555);
        cliente.setCredito(108938);

		System.out.println("Nombre: " + cliente.getNombre());
		System.out.println("Edad: " + cliente.getEdad());
		System.out.println("Teléfono: " + cliente.getTelefono());
		System.out.println("Crédito: " + cliente.getCredito());

		Trabajador trabajador = new Trabajador();
		trabajador.setNombre("Maria");
        trabajador.setEdad(22);
        trabajador.setTelefono(555555556);
        trabajador.setSalario(1089);

		System.out.println("Nombre: " + trabajador.getNombre());
		System.out.println("Edad: " + trabajador.getEdad());
		System.out.println("Teléfono: " + trabajador.getTelefono());
		System.out.println("Salario: " + trabajador.getSalario());
	}
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    // getters y setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {

	private double credito;

    // getters y setters
    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    // getters y setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
