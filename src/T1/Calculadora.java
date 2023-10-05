package T1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double suma = suma(a,b);
        double resta = a - b;
        double multiplicacion = a * b;
        double division = a / b;

        System.out.println("Suma:" + suma);
        System.out.println("Resta:" + resta);
        System.out.println("Multiplicacion:" + multiplicacion);
        System.out.println("Division:" + division);
    }
    public static double suma(double x, double y){

        return x+y;
    }
}
