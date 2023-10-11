package T2;

import java.util.Scanner;

public class Telefono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0, precio;
        System.out.println("Hora (mañana/tarde):");
        String hora = sc.nextLine();
        System.out.println("Dia de la llamada:");
        String dia = sc.nextLine();
        System.out.println("Minutos que ha durado la llamada:");
        int minuto = sc.nextInt();

        if (minuto <= 5) {
            precio = 1;
            resultado = precio * minuto;
        } else if (minuto > 5 && minuto <= 8) {
            precio = 0.8;
            resultado += 5 + precio * (minuto - 5);
        } else if (minuto > 8 && minuto <= 10) {
            precio = 0.7;
            resultado = 7.4 + precio * (minuto - 8);
        } else {
            precio = 0.5;
            resultado = 8.8 + precio * (minuto - 10);
        }

        if (dia.equals("domingo")) {
            resultado = resultado + resultado * 0.03;
        } else if (!dia.equals("domingo") && hora.equals("mañana")) {
            resultado = resultado + resultado * 0.15;
        } else if (!dia.equals("domingo") && hora.equals("tarde")) {
            resultado = resultado + resultado * 0.10;
        }
        System.out.println("El coste total de la llamada ha sido: " + resultado + "€");


    }
}
