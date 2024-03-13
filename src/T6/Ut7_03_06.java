package T6;

import java.io.*;
import java.util.*;

public class Ut7_03_06 {
    public static void main(String[] args) throws IOException {
        Map<Estudiante, List<Float>> lista=new LinkedHashMap<>();
        try(Scanner sc=new Scanner(System.in)){
            List<Float> calificaciones=new ArrayList<>();
            String nombre;
            float notas;
            do {
                System.out.println("Introduzca el nombre del alumno:");
                nombre= sc.next();
                if (!nombre.equalsIgnoreCase("fin")){
                    System.out.println("Introduce calificaciones del estudiante:");
                    do {
                        notas=sc.nextFloat();
                        if (notas>=0) calificaciones.add(notas);
                    }while (notas!=-1);
                    lista.put(new Estudiante(nombre),calificaciones);
                }
            }while (!nombre.equalsIgnoreCase("FIN"));
        }
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("notas4.dat"))) {
            oos.writeObject(lista);
        }
    }
}
