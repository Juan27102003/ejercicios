package T2;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base=sc.nextInt();
        double exponente=sc.nextInt();
        double resultado=Math.pow(base,exponente);
        if (exponente==0){
            System.out.println("El resultado es 0");
        }else System.out.println(resultado);


    }
}
