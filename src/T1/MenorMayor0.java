package T1;

import java.util.Scanner;

public class MenorMayor0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String solucion = x < 0 ? "El numero es menor que cero" : x <= 100 ? "El numero esta entre 0 y 100" : "El numero es mayor que 100";
        System.out.println(solucion);
    }
}
