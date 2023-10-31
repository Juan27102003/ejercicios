package T2;

import java.util.Scanner;

public class SiguienteSegundo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int horas=sc.nextInt();
        int minutos=sc.nextInt();
        int segundos=sc.nextInt();
        segundos++;
        if (segundos>59){
            minutos++;
        }
        if (minutos>59){
            horas++;
        }
        if (horas>23){
            horas=0;
        }
        System.out.printf("%02d:%02d:%02d",horas,minutos,segundos);
    }
}
