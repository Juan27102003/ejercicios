package T1;

import java.util.Scanner;

public class Coche {
    public static void main(String[] args) {
        int capacidad, gasolina_res, distancia, viajes;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce capacidad del deposito: ");

        capacidad = sc.nextInt();

        System.out.println("Introduce cuanta gasolina consume un viaje: ");

        distancia = sc.nextInt();
        sc.close();

        gasolina_res = capacidad % distancia;

        viajes = capacidad / distancia;

        System.out.println("Puedes dar " + viajes + " viajes y te quedan " + gasolina_res + " litros de gasolina");
    }
}
