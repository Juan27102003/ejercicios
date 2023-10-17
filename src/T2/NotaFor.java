package T2;

import java.util.Scanner;

public class NotaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        double suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce la nota " + i + ":");
            nota = sc.nextDouble();
            suma += nota;
        }
        System.out.println("La suma de todas las notas es:" + suma);
    }
}