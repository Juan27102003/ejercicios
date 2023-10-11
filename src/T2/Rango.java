package T2;

import java.util.Scanner;

public class Rango {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion=sc.nextInt();
        switch (opcion){
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            default:
                System.out.println("Fuera de rango");
        }
        System.out.println("Segundo switch:");

        switch (opcion){
            case 0:
            case 1:
            case 2:
                System.out.println("Menor que tres");
                break;
            case 3:
                System.out.println("Igual a tres");
                break;
            default:
                System.out.println("Mayor que tres");
        }
    }
}
