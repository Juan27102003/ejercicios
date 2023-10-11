package T2;

import java.util.Scanner;

public class Transporte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio, resultado = 0;
        System.out.println("Introduce el destino (America del Norte/America Central/Amercica del Sur/Europa/Asia):");
        String destino = sc.nextLine();
        System.out.println("Introduce el peso de la mercancia:");
        int peso = sc.nextInt();

        if (peso > 5) {
            System.out.println("No se hacen envios de mas de 5Kg");
        } else {
            if (destino.equals("America del norte")) {
                precio = 24;
                resultado = precio * peso;
            } else if (destino.equals("America Central")) {
                precio = 20;
                resultado = precio * peso;
            } else if (destino.equals("America del Sur")) {
                precio = 21;
                resultado = precio * peso;
            } else if (destino.equals("Europa")) {
                precio = 10;
                resultado = precio * peso;
            } else if (destino.equals("Asia")) {
                precio = 18;
                resultado = precio * peso;
            } else System.out.println("El destino no es valido");
        }
        System.out.println("El coste del envio es " + resultado + "€");
    }
}
