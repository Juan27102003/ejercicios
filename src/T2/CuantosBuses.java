package T2;

import java.util.Scanner;

public class CuantosBuses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int personas = 0;
        int buses;
        do {
            System.out.println("Personas del grupo (0=FIN):");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("No puede ser negativo");
            } else if (n > 0) {
                personas += n;
                System.out.println("Apuntados. Van " + personas + " personas");
            }
        } while (n != 0);
        buses = personas / 55;
        if (personas % 55 != 0) {
            buses++;
        }
        System.out.println("Se necesitan " + buses + " autobuses");
    }
}
