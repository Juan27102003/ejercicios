package T1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Suma:" + suma(a, b));
        System.out.println("Resta:" + resta(a, b));
        System.out.println("Multiplicacion:" + multiplicacion(a, b));
        System.out.println("Division:" + division(a, b));
    }

    public static double suma(double x, double y) {
        return x + y;
    }

    public static double resta(double x, double y) {
        return x - y;
    }

    public static double multiplicacion(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }
}
