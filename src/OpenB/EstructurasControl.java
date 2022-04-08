package OpenB;

public class EstructurasControl {
    public static void main(String[] args) {
        int numeroIf = -5;

        if(numeroIf > 0){
            System.out.println("El numero " + numeroIf + " es positivo.");
        } else if(numeroIf < 0){
            System.out.println("El numero " + numeroIf + " es negativo.");
        } else {
            System.out.println("El numero proporcionado es cero.");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("El valor de la variable numeroWhile es: " + numeroWhile);
        }

        do{
            numeroWhile++;
            System.out.println("El valor de la variable numeroWhile es: " + numeroWhile);
        } while (numeroWhile < 1);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("La variable numeroFor tiene un valor de: " + numeroFor);
        }

        String estacion = "Invierno";
        switch (estacion){
            case "Primavera":
                System.out.println("Estamos en " + estacion);
                break;
            case "Verano":
                System.out.println("Estamos en " + estacion);
                break;
            case "Otoño":
                System.out.println("Estamos en " + estacion);
                break;
            case "Invierno":
                System.out.println("Estamos en " + estacion);
                break;
            default:
                System.out.println("Introduce la informacion correcta.");
        }
    }
}
