public class ejercicio_tema_3_parte2 {

	public static void main(String[] args) {
		coche micoche = new coche();
		micoche.add_doors();
		System.out.println("mi coche tiene " + micoche.doors + " puertas");
	} 
}

class coche {

	public int doors = 2;

	public void add_doors(){
		this.doors++;
	}
}