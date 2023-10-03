package T1;

import java.util.Scanner;

public class Multas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tipo de vehiculo:");
        char vehiculo = sc.nextLine().charAt(0);

        System.out.println("Introduce la velocidad:");
        int velocidad = sc.nextInt();

        String multa = (vehiculo == 'T' && velocidad > 120) || (vehiculo == 'C' && velocidad > 100) || (vehiculo == 'M' && velocidad > 50) ? "Verdadero" : "Falso";

        System.out.println("¿Hay multa? " + multa);
    }
}
