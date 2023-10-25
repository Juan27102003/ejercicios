package T2;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(99) + 1;
        int intento, cont = 1;
        for (int i = 9; i >= 0; i--) {
            intento = sc.nextInt();

            if (intento == num) {
                System.out.println("Felicidades has acertado");
                cont = 0;
                break;

            } else System.out.println("Te quedan " + i + " oportunidades");
        }
        if (cont == 1) {
            System.out.println("No has acertado el numero era " + num);
        }
    }
}