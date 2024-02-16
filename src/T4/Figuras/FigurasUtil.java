package T4.Figuras;

import java.util.List;
import java.util.Scanner;

public class FigurasUtil {
    public static Circulo crearCirculo(Scanner sc){
        System.out.println("Introduce nombre de la figura:");
        String nombre=sc.next();

        System.out.println("Introduce el radio");
        double radio=sc.nextDouble();

        Circulo c=new Circulo(nombre,radio);
        return c;
    }
    public static Cuadrado crearCuadrado(Scanner sc){
        System.out.println("Introduce nombre de la figura:");
        String nombre=sc.next();

        System.out.println("Introduce el lado");
        double lado=sc.nextDouble();

        Cuadrado cu=new Cuadrado(nombre,lado);
        return cu;
    }
    public static TrianguloEquilatero crearTrianguloEquilatero(Scanner sc){
        System.out.println("Introduce nombre de la figura:");
        String nombre=sc.next();

        System.out.println("Introduce el radio");
        double lado=sc.nextDouble();

        TrianguloEquilatero t=new TrianguloEquilatero(nombre,lado);
        return t;
    }
    public static void calcularAreas(List<FiguraGeometrica> figuras, Scanner sc){
        for (FiguraGeometrica f:figuras){
            System.out.println("Area de "+f.nombre+": "+f.calcularArea());
        }
        sc.next();
    }
    public static void calcularPerimetros(List<FiguraGeometrica> figuras,Scanner sc){
        for (FiguraGeometrica f:figuras){
            System.out.println("Perimetro de "+f.nombre+": "+f.calcularPerimetro());
        }
        sc.next();
    }
}
