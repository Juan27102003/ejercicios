package T2;

import java.util.Scanner;

public class EdadEstatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, estatura, mediaedad = 0, mediaestatura = 0, contedad = 0, contaltura = 0, cont = 0;
        do {
            System.out.println("Edad:");
            edad = sc.nextInt();
            System.out.println("Altura(cm):");
            estatura = sc.nextInt();
            if (edad > 0 && estatura > 0) {
                mediaedad += edad;
                mediaestatura += estatura;
                if (edad > 18) {
                    contedad++;
                }
                if (estatura > 175) {
                    contaltura++;
                }
                cont++;
            }

        } while (edad > 0 || estatura > 0);
        mediaedad = mediaedad / cont;
        mediaestatura = mediaestatura / cont;
        System.out.println("La media de la edad es " + mediaedad);
        System.out.println("La media de la altura es " + mediaestatura);
        System.out.println("Se han introducido " + contedad + " mayores de 18");
        System.out.println("Se han introducido " + contaltura + " con mas de 175cm de altura");
    }
}
