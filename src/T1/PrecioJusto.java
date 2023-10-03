package T1;

import java.util.Scanner;

public class PrecioJusto {
    public static void main(String[] args) {
        int J1, J2, precio;
        Scanner sc = new Scanner(System.in);
        J1 = sc.nextInt();
        J2 = sc.nextInt();
        precio = sc.nextInt();

        String ganador1 = J1 <= precio && (precio - J2 > precio - J1 || J2 > precio) ? "Verdadero" : "Falso";
        String ganador2 = J2 <= precio && (precio - J1 > precio - J2 || J1 > precio) ? "Verdadero" : "Falso";

        System.out.println("J1:" + J1 + " J2:" + J2 + " Gana el jugador 1? " + ganador1 + " Gana el jugador 2? " + ganador2);
    }
}
