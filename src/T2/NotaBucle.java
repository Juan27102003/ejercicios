package T2;

import java.util.Scanner;

public class NotaBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota = 0;
        float suma = 0;
        while (nota != -1) {
            System.out.println("Introduce nota:");
            nota = sc.nextFloat();
            if (nota != -1) {
                suma += nota;
            }
        }
        System.out.println(suma);
    }
}
