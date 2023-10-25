package AceptaElReto;

import java.util.Scanner;

public class AR_CarreraPopular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nombre, apellido;
        String aux = "";
        int contHer = 1;
        int contPar = 0;
        for (int i = 0; i < n; i++) {
            do {
                apellido = sc.next();
                nombre = sc.next();
                if ((apellido + nombre).length() < 40) {
                    if (apellido.equalsIgnoreCase(aux)) contHer++;
                    aux = apellido;
                    if (!nombre.equals("====") && !apellido.equals("====")) contPar++;
                }
            } while (!nombre.equals("====") && !apellido.equals("===="));
            System.out.println(contPar);
            if (contHer > 1) {
                System.out.println(contHer);
            } else System.out.println("0");
            contPar = 0;
            contHer = 1;
        }
    }
}
