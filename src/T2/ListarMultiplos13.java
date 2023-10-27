package T2;

import java.util.Scanner;

public class ListarMultiplos13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                if (i % 13 == 0) System.out.println(i);
            }
        } while (num > 0);
    }
}
