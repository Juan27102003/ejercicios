package T2;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        if (n2 == 0) {
            System.out.println("Error no se puede dividir entre 0");
        } else System.out.println("El resultado es " + n1 / n2);
    }
}
