package T6;
import java.io.*;
import java.util.*;

public class Ut7_03_01a {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.print("Introduce el nombre del estudiante: ");
        nombre = sc.nextLine();
        List<Float> calificaciones = new ArrayList<>();
        System.out.println("Introduce las calificaciones, -1 para terminar:");
        while (true) {
            float calificacion = sc.nextFloat();
            if (calificacion == -1) break;
            calificaciones.add(calificacion);
        }
// Guardar datos
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("notas.dat"))
        ) {
            dos.writeUTF(nombre);
            dos.writeInt(calificaciones.size());
            for (Float f : calificaciones) {
                dos.writeFloat(f);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
