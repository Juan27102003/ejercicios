package T6;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ut7_03_02 {
    public static void main(String[] args) {
        Set<String> lista =new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        String nombre;
        while (true){
            System.out.println("Introduce el nombre:");
            nombre= sc.next();
            if (nombre.equalsIgnoreCase("FIN")) break;
            lista.add(nombre);
        }
        try(DataOutputStream d =new DataOutputStream(new FileOutputStream("fiesta.dat"))) {

            for (String n:lista) {
                d.writeUTF(n);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(DataInputStream d=new DataInputStream(new FileInputStream("fiesta.dat"))) {
            while (true){
                System.out.println(d.readUTF());
            }
        }catch (EOFException e){
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
