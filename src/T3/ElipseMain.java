package T3;

import java.util.Scanner;

public class ElipseMain {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Elipse e = new Elipse(sc.nextDouble(), sc.nextDouble());
        System.out.println("El area de la elipse es " + e.calcularArea(e.altura, e.longitud));
        System.out.println("El perimetro de la elipse es " + e.calcularPerimetro(e.altura, e.longitud));
        System.out.println(e);
    }
}
