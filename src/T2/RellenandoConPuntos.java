package T2;

import java.util.Scanner;

public class RellenandoConPuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, aux = 1, v;
        String cad;
        char caracter;
        do {
            cad = sc.nextLine();
            if (cad.length() > 80) {
                System.out.println("La cadena es demasiado larga");
            } else {
                aux = 0;
            }
        } while (aux != 0);
        v = cad.length();
        System.out.println("Introduce el numero de caracteres:");
        n = sc.nextInt();
        do {
            System.out.println("Izquierda(I) o derecha(D):");
            caracter = sc.next().charAt(0);
            if (caracter == 'I') {
                for (int i = 0; i <= n; i++) {
                    if (n > cad.length()) {
                        cad = "." + cad;
                    }
                }
                if (n == v || n < v) {
                    System.out.println("La cadena no cabe");
                }
                aux = 1;
            } else if (caracter == 'D') {
                for (int i = 0; i <= n; i++) {
                    if (n > cad.length()) {
                        cad = cad + ".";
                    }
                }
                if (n == v || n < v) {
                    System.out.println("La cadena no cabe");
                }
                aux = 1;

            } else {
                System.out.println("El caracter introducido no es valido");
            }
        } while (aux != 1);
        if (n > v) {
            System.out.println(cad);
        }
    }
}
