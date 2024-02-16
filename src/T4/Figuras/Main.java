package T4.Figuras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<FiguraGeometrica> figuras;
    public static void main(String[] args) {
        figuras=new ArrayList<>();
        menu();
    }
    private static void menu(){
        Scanner sc=new Scanner(System.in);
        int opcion;
        double lado;
        String nombre;
        do {
            System.out.println("Menu");
            System.out.println("Selecciona figura geometrica:");
            System.out.println("1.Triangulo equilatero");
            System.out.println("2.Circulo");
            System.out.println("3.Cuadrado");
            System.out.println("0.Salir");
            opcion=sc.nextInt();
            if (opcion==0) break;
            System.out.println("Nombre de la figura:");
            nombre=sc.next();
            System.out.println("Lado de la figura:");
            lado= sc.nextDouble();
            FiguraGeometrica f1=new FiguraGeometrica(nombre,lado);
            switch (opcion){
                case 1:
                    TrianguloEquilatero t1=new TrianguloEquilatero(f1.nombre, f1.lado);
                    System.out.println("El area es "+t1.calcularArea());
                    System.out.println("El perimetro es "+t1.calcularPerimetro());
                    break;
                case 2:
                    Circulo c1=new Circulo(f1.nombre, f1.lado);
                    System.out.println("El area es "+c1.calcularArea());
                    System.out.println("El perimetro es "+c1.calcularPerimetro());
                    break;
                case 3:
                    Circulo cu1=new Circulo(f1.nombre, f1.lado);
                    System.out.println("El area es "+cu1.calcularArea());
                    System.out.println("El perimetro es "+cu1.calcularPerimetro());
                    break;
            }
        }while (true);
    }
}
