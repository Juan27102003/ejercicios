package T2;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnos = sc.nextInt();
        double pago;
        double precioAlumno;
        if (alumnos >= 100) {
            precioAlumno = 65;
            pago = alumnos * precioAlumno;
        } else if (alumnos >= 50 && alumnos < 100) {
            precioAlumno = 70;
            pago = alumnos * precioAlumno;
        } else if (alumnos >= 30 && alumnos < 50) {
            precioAlumno = 95;
            pago = alumnos * precioAlumno;
        } else {
            pago = 4000;
            precioAlumno = pago / alumnos;
        }
        System.out.println("El pago total es " + pago + " y el precio por alumno es " + precioAlumno);
    }
}
