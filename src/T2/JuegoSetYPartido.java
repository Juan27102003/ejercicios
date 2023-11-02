package T2;

import java.util.Scanner;

public class JuegoSetYPartido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String punto;
        int puntoA = 0;
        int puntoB = 0;
        int contA = 0;
        int contB = 0;
        do {
            System.out.println("Juego: " + puntoA + "-" + puntoB);
            punto = sc.next();
           /* if (punto.equals("A")) {
                if (puntoA == 0) {
                    puntoA = 15;
                } else if (puntoA == 15) {
                    puntoA = 30;
                } else if (puntoA == 30) {
                    puntoA = 40;
                } else if (puntoA==40) {
                    puntoA=45;
                }
            }
            if (punto.equals("B")) {
                if (puntoB == 0) {
                    puntoB = 15;
                } else if (puntoB == 15) {
                    puntoB = 30;
                } else if (puntoB == 30) {
                    puntoB = 40;
                }else if (puntoB==40){
                    puntoB=45;
                }
            }
            if (puntoA<45&&puntoB<45&&contA==0&&contB==0) System.out.println("Juego: " + puntoA + "-" + puntoB);

            if (puntoA==45&&puntoB==40&&punto.equals("A")) {
                contA=1;
                System.out.println("Ventaja jugador 1");
            } else if (puntoB==45&&puntoA==40&&punto.equals("B")) {
                contB=1;
                System.out.println("Ventaja jugador 2");
            }
            if (puntoA == 45 && puntoB != 45&&contA==0){
                System.out.println("Ha ganado el jugador 1");
                contA=10;
            } else if (puntoB == 45 && puntoA != 45&&contB==0){
                System.out.println("Ha ganado el jugador 2");
                contB=10;
            }
            if (contB==1&&punto.equals("A")){
                contB=0;
            }*/

            if (punto.equals("A")) {
                if (puntoA == 0) {
                    puntoA = 15;
                } else if (puntoA == 15) {
                    puntoA = 30;
                } else if (puntoA == 30) {
                    puntoA = 40;
                } else if (puntoA == 40 && puntoB < 40||puntoA == 40 && puntoB == 40 && contA==1) {
                    System.out.println("Ha ganado el jugador 1");
                    break;
                } else if (puntoA == 40 && puntoB == 40) {
                    if (contB==0){
                        contA = 1;
                        System.out.println("Ventaja jugador 1");
                    } else {
                    contB = 0;
                    }
                }
            }

            if (punto.equals("B")) {
                if (puntoB == 0) {
                    puntoB = 15;
                } else if (puntoB == 15) {
                    puntoB = 30;
                } else if (puntoB == 30) {
                    puntoB = 40;
                } else if (puntoB == 40 && puntoA < 40||puntoB == 40 && puntoA == 40&&contB==1) {
                    System.out.println("Ha ganado el jugador 2");
                    break;
                } else if (puntoB == 40 && puntoA == 40) {
                    if (contA==0){
                        contB = 1;
                        System.out.println("Ventaja jugador 2");
                    } else if (contB == 1) {
                } else {
                    contA = 0;
                }
                }
            }
        } while (true);
    }
}
