package T2;

import java.util.Scanner;

public class Bucle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota;
        float suma = 0;
        do {
            System.out.println("Introduce nota:");
            nota = sc.nextFloat();
            if (nota != -1) {
                suma += nota;
            }
        } while (nota != -1);
        System.out.println(suma);
    }
}
