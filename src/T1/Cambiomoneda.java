package T1;

import java.util.Scanner;

public class Cambiomoneda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneda = sc.nextDouble();
        cambioLibras(moneda);
        cambioDolares(moneda);
    }

    public static void cambioLibras(double euro) {
        double resultado_libras = euro * 0.86;
        System.out.println(euro + " euros son " + resultado_libras + " libras");
    }

    public static void cambioDolares(double euro) {
        double resultado_dolares = euro * 1.05;
        System.out.println(euro + " euros son " + resultado_dolares + " dolares");
    }
}
