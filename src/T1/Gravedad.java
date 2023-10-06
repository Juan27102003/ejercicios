package T1;

import java.util.Scanner;

public class Gravedad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la primera masa:");
        double m1= sc.nextDouble();
        System.out.println("Introduce la segunda masa:");
        double m2= sc.nextDouble();
        System.out.println("Introduce la distancia:");
        double distancia= sc.nextDouble();
        double resultado=(m1*m2*6.673*Math.pow(10,-11))/(distancia*distancia);

        System.out.println("El resultado es:"+resultado+"N");
    }
}
