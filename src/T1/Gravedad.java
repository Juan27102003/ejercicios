package T1;

import java.util.Scanner;

public class Gravedad {
    static final double CONSTANTE_GRAVITACIONAL=6.673e-11;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la primera masa:");
        double m1= sc.nextDouble();
        System.out.println("Introduce la segunda masa:");
        double m2= sc.nextDouble();
        System.out.println("Introduce la distancia:");
        double distancia= sc.nextDouble();

        System.out.println("El resultado es:"+resultado(m1,m2,distancia)+"N");
    }
    public static double resultado(double a,double b,double c){
        return (a*b*CONSTANTE_GRAVITACIONAL)/(c*c);
    }

}
