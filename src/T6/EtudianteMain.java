package T6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EtudianteMain {
    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("estudiantes.dat"))
        ) {
            List<Estudiante> grupo = new ArrayList<>();
            grupo.add(new Estudiante("Chuck Norris", 10));
            grupo.add(new Estudiante("Mortadelo", 5));
            oos.writeObject(grupo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(ObjectInputStream ios=new ObjectInputStream(new FileInputStream("estudiantes.dat"))){
            List<Estudiante> lista= (List<Estudiante>) ios.readObject();
            System.out.println(lista);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
