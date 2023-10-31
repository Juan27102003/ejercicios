package T2;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        String jugada;
        int jugada_ordenador;
        //1=piedra 2=tijera 3=papel
        do {
            jugada_ordenador = rd.nextInt(3) + 1;
            System.out.println("Elige una opcion:");
            System.out.println("A:Piedra");
            System.out.println("B:Papel");
            System.out.println("C:Tijera");
            System.out.println("Escriba X para salir");
            jugada = sc.next();
            if (!jugada.equals("X")) {
                if (jugada_ordenador == 1) System.out.println("El ordenador ha elegido piedra");
                if (jugada_ordenador == 2) System.out.println("El ordenador ha elegido tijera");
                if (jugada_ordenador == 3) System.out.println("El ordenador ha elegido papel");
            }
            if (jugada_ordenador == 1 && jugada.equals("A") || jugada_ordenador == 2 && jugada.equals("C") || jugada_ordenador == 3 && jugada.equals("B"))
                System.out.println("Ha sido un empate");
            if (jugada_ordenador == 1 && jugada.equals("C") || jugada_ordenador == 2 && jugada.equals("B") || jugada_ordenador == 3 && jugada.equals("A"))
                System.out.println("Has perdido");
            if (jugada_ordenador == 1 && jugada.equals("B") || jugada_ordenador == 2 && jugada.equals("A") || jugada_ordenador == 3 && jugada.equals("C"))
                System.out.println("Has ganado");
        } while (!jugada.equals("X"));
    }
}
