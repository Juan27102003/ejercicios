package AceptaElReto;

import java.util.Scanner;

public class AR_CuantosDiasFaltan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces = sc.nextInt();
        int dia, mes, resultado = 0;
        for (int i = 0; i < veces; i++) {
            dia = sc.nextInt();
            mes = sc.nextInt();
            if (mes == 1) {
                resultado = 365 - dia;
            } else if (mes == 2) {
                resultado = 334 - dia;
            } else if (mes == 3) {
                resultado = 306 - dia;
            } else if (mes == 4) {
                resultado = 275 - dia;
            } else if (mes == 5) {
                resultado = 245 - dia;
            } else if (mes == 6) {
                resultado = 214 - dia;
            } else if (mes == 7) {
                resultado = 184 - dia;
            } else if (mes == 8) {
                resultado = 153 - dia;
            } else if (mes == 9) {
                resultado = 122 - dia;
            } else if (mes == 10) {
                resultado = 92 - dia;
            } else if (mes == 11) {
                resultado = 61 - dia;
            } else if (mes == 12) {
                resultado = 31 - dia;
            }
            System.out.println(resultado);
        }

    }
}
