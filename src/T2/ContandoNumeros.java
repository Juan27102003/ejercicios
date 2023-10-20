package T2;

import java.util.Scanner;

public class ContandoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cont0 = 0, contpositivos = 0, contnegativos = 0;
        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            if (n == 0) {
                cont0++;
            } else if (n < 0) {
                contnegativos++;
            } else contpositivos++;
        }
        System.out.println("Has introducido " + cont0 + " ceros");
        System.out.println("Has introducido " + contpositivos + " numeros positivos");
        System.out.println("Has introducido " + contnegativos + " numeros negativos");
    }
}
