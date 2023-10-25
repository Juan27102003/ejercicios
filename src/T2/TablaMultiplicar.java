package T2;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            if (num > 0) {
                for (int i = 1; i < 11; i++) {

                    System.out.println(num + "x" + i + "=" + i * num);
                }
            }
        } while (num > 0);
    }
}
