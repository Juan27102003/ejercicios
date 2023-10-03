package T1;

import java.util.Scanner;

public class Trece_Catorce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int llave1 = sc.nextInt();
        int llave2 = sc.nextInt();
        String resultado = llave1 < llave2 && llave1 % 2 == 0 && llave1 == llave2 - 1 || llave2 < llave1 && llave2 % 2 == 0 && llave2 == llave1 - 1 ? "verdadero" : "falso";
        System.out.println(resultado);
    }
}
