package AceptaElReto;

import java.util.Scanner;

public class AR_SanFermines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veces:");
        int veces = sc.nextInt();
        int velToros, aux = 0;

        for (int i = 0; i < veces; i++) {
            velToros = sc.nextInt();
            if (velToros > aux) aux = velToros;
        }
        System.out.println(aux);
    }
}
