package T5;

import java.util.Scanner;

public class Actividad5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') contA++;
            if (cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E') contE++;
            if (cadena.charAt(i) == 'i' || cadena.charAt(i) == 'I') contI++;
            if (cadena.charAt(i) == 'o' || cadena.charAt(i) == 'O') contO++;
            if (cadena.charAt(i) == 'u' || cadena.charAt(i) == 'U') contU++;
        }
        System.out.println("A:" + contA + " *".repeat(contA));
        System.out.println("E:" + contE + " *".repeat(contE));
        System.out.println("I:" + contI + " *".repeat(contI));
        System.out.println("O:" + contO + " *".repeat(contO));
        System.out.println("U:" + contU + " *".repeat(contU));
    }
}
