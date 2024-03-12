package T6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Ut7_03_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try (DataOutputStream d=new DataOutputStream(new FileOutputStream("quiniela.dat"))){
        System.out.println("Cuantas jornadas hay?");
        int jornadas= sc.nextInt();
        System.out.println("Cuantos partidos tiene cada jornada?");
        int partidos= sc.nextInt();
        sc.nextLine();
        for (int i=0;i<jornadas;i++){
            System.out.println("Introduce la fecha:");
            String fecha= sc.nextLine();
            d.writeUTF(fecha);
            for (int j =1 ;j<=partidos;j++){
                System.out.println("Resultado del partido "+ j +":");
                String resultado= sc.nextLine();
                String [] s=resultado.split(" ");
                int golesLocal=Integer.parseInt(s[0]);
                int golesVisitante=Integer.parseInt(s[1]);
                d.write(golesLocal);
                d.write(golesVisitante);
            }
        }
    } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
