package T2;

import java.util.Scanner;

public class ComoSeEscribe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cent, dec, unid;
        String resultado = "";
        do {
            num = sc.nextInt();
            cent = num / 100;
            dec = num / 10 % 10;
            unid = num % 10;
            if (cent == 1 && (dec > 0 || unid > 0)) {
                resultado = "Ciento ";
            } else if (cent == 1 && dec == 0 && unid == 0) {
                System.out.println("Cien");
            } else if (cent == 2) {
                resultado = "Doscientos ";
            } else if (cent == 3) {
                resultado = "Trescientos ";
            } else if (cent == 4) {
                resultado = "Cuatrocientos ";
            } else if (cent == 5) {
                resultado = "Quinientos ";
            } else if (cent == 6) {
                resultado = "Seiscientos ";
            } else if (cent == 7) {
                resultado = "Setecientos ";
            } else if (cent == 8) {
                resultado = "Ochocientos ";
            } else if (cent == 9) {
                resultado = "Novecientos ";
            }

            if (dec == 1 && unid > 5) {
                resultado = resultado + "dieci";
            } else if (dec == 1 && unid == 1) {
                resultado = resultado + "once";
            } else if (dec == 1 && unid == 2) {
                resultado = resultado + "doce";
            } else if (dec == 1 && unid == 3) {
                resultado = resultado + "trece";
            } else if (dec == 1 && unid == 4) {
                resultado = resultado + "catorce";
            } else if (dec == 1 && unid == 5) {
                resultado = resultado + "quince";
            } else if (dec == 2 && unid == 0) {
                resultado = resultado + "veinte";
            } else if (dec == 2 && unid > 0) {
                resultado = resultado + "veinti";
            } else if (dec == 3 && unid == 0) {
                resultado = resultado + "treinta";
            } else if (dec == 3 && unid > 0) {
                resultado = resultado + "treinta y ";
            } else if (dec == 4 && unid == 0) {
                resultado = resultado + "cuarenta";
            } else if (dec == 4 && unid > 0) {
                resultado = resultado + "cuarenta y ";
            } else if (dec == 5 && unid == 0) {
                resultado = resultado + "cincuenta";
            } else if (dec == 5 && unid > 0) {
                resultado = resultado + "cincuenta y ";
            } else if (dec == 6 && unid == 0) {
                resultado = resultado + "sesenta";
            } else if (dec == 6 && unid > 0) {
                resultado = resultado + "sesenta y";
            } else if (dec == 7 && unid == 0) {
                resultado = resultado + "setenta";
            } else if (dec == 7 && unid > 0) {
                resultado = resultado + "setenta y ";
            } else if (dec == 8 && unid == 0) {
                resultado = resultado + "ochenta";
            } else if (dec == 8 && unid > 0) {
                resultado = resultado + "ochenta y ";
            } else if (dec == 9 && unid == 0) {
                resultado = resultado + "noventa";
            } else if (dec == 9 && unid > 0) {
                resultado = resultado + "noventa y ";
            }

            if (unid == 1 && dec != 1) {
                resultado = resultado + "uno";
            }
            if (unid == 2 && dec != 1) {
                resultado = resultado + "dos";
            }
            if (unid == 3 && dec != 1) {
                resultado = resultado + "tres";
            }
            if (unid == 4 && dec != 1) {
                resultado = resultado + "cuatro";
            }
            if (unid == 5 && dec != 1) {
                resultado = resultado + "cinco";
            }
            if (unid == 6) {
                resultado = resultado + "seis";
            }
            if (unid == 7) {
                resultado = resultado + "siete";
            }
            if (unid == 8) {
                resultado = resultado + "ocho";
            }
            if (unid == 9) {
                resultado = resultado + "nueve";
            }

            System.out.println(resultado);
            resultado = "";
        } while (num > 0 && num < 1000);
    }
}
