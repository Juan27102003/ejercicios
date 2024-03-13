package T6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ut7_03_06b {
    public static void main(String[] args) throws FileNotFoundException {
        try(ObjectInputStream ios=new ObjectInputStream(new FileInputStream("notas4.dat"))){
            Map<Estudiante, List<Float>> lista= (Map<Estudiante, List<Float>>) ios.readObject();
            for (Map.Entry<Estudiante,List<Float>> o: lista.entrySet()) {
                List<Float> notas=o.getValue();
                if (!notas.isEmpty()){
                    float suma=0;
                    System.out.println("Mostrando calificaciones de " + o.getKey()+":");

                    for (float i: notas){
                        System.out.println(i);
                        suma+=i;
                    }
                    System.out.println("La media es " + suma/notas.size());
                }else System.out.println("No se han introducido calificaciones");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
