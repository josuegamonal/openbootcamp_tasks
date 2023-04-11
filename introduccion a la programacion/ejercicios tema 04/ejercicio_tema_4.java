
public class ejercicio_tema_4 {
    public static void main(String[] args) {
        int numeroIf = -2;

        if (numeroIf >= 0){
            System.out.println("el numero es positivo");
        } else {
            System.out.println("el numero es negativo");
        }

		System.out.println("..........");

        int numeroWhile = 1;
        while (numeroWhile <3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

		System.out.println("..........");

        int numeroDoWhile = 3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);

		System.out.println("..........");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

		System.out.println("..........");

        var estacion = "verano";

        switch (estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}