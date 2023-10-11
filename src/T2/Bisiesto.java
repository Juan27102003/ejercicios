package T2;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anyo = sc.nextInt();
        if ((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else System.out.println("El año no es bisiesto");
    }
}
