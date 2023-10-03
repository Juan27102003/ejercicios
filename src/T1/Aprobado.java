package T1;

import java.util.Scanner;

public class Aprobado {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int nota1=sc.nextInt();
        int nota2=sc.nextInt();
        int nota3=sc.nextInt();

        int media=(nota1+nota2+nota3)/3;

        String solucion= media>=5 ? "El alumno esta aprobado" : "El alumno esta suspenso";
        System.out.println(solucion);
    }
}
