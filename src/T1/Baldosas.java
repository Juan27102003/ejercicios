package T1;

import java.util.Scanner;

public class Baldosas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ancho:");
        float ancho = sc.nextFloat();
        System.out.println("Largo:");
        float largo = sc.nextFloat();
        System.out.println("Metros cuadrados de cada baldosa:");
        float metros_cuadrados = sc.nextFloat();
        System.out.println("Numero de baldosas:");
        float num_baldosas = sc.nextFloat();

        String resultado = ancho * largo <= metros_cuadrados * num_baldosas ? "Verdadero" : "Falso";
        System.out.println(resultado);
    }
}
