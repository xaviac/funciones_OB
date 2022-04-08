package OpenB;

public class Main {

    public static void main(String[] args) {

        System.out.println(suma(5,9,7));

        Coche miCoche = new Coche();
        miCoche.sumPuertas();
        System.out.println(miCoche.numPuertas);
        miCoche.sumPuertas();
        System.out.println(miCoche.numPuertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class Coche {
    public int numPuertas = 0;

    public void sumPuertas() {
        numPuertas++;
    }
}