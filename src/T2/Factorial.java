package T2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 1;
        do {
            num = sc.nextInt();
            if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    suma = suma * i;
                }
            }
            System.out.println(suma);
            suma = 1;
        } while (num > 0);
    }
}
