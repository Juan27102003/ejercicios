package T2;

import java.util.Scanner;

public class CrecienteDecreciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, flag, crec = 0, decre = 0, cont = 0;
        num = sc.nextInt();
        flag = num;
        while (num >= 0) {
            cont++;
            num = sc.nextInt();
            if (num > 0) {
                if (num > flag) {
                    crec++;
                } else if (num < flag) {
                    decre++;
                } else {
                    crec++;
                    decre++;
                }
            }
            flag = num;
        }
        if (cont == 0) {
            System.out.println("No se han introducido numeros");
        }
        if (crec > 0 && decre == 0) {
            System.out.println("Creciente");
        } else if (crec == 0 && decre > 0) {
            System.out.println("Decreciente");
        } else if (crec > 0 && decre > 0) {
            System.out.println("Ni crece ni decrece");
        }
    }
}
