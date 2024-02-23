package T5.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea_Ut6_03_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        int posicion;
        String nombre,apellidos,telefono;
        Persona p1=new Persona("Juan","Garcia","9855352727");
        Persona p2=new Persona("Pepe","Perez","274839284");
        Persona p3=new Persona("Felipe","Vazquez","2748593674");
        Persona p4=new Persona("Diego","Rodriguez","274869255");
        Persona p5=new Persona("Alonso","Martinez","264893056");
        ArrayList<Persona> lista=new ArrayList<>();
        do {
            System.out.println("Menu:");
            System.out.println("1.Listar personas almacendas");
            System.out.println("2.Añadir persona final lista");
            System.out.println("3.Añadir persona posicion señalada");
            System.out.println("4.Eliminar persona de la lista");
            System.out.println("5.Eliminar todas las personas de la lista");
            System.out.println("6.Devolver numero de personas");
            System.out.println("7.Salir");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    for (Persona o: lista){
                        System.out.println(o);
                    }
                    break;
                case 2:
                    System.out.println("Nombre:");
                    nombre= sc.next();
                    System.out.println("Apellidos:");
                    apellidos= sc.next();
                    System.out.println("Telefono:");
                    telefono= sc.next();
                    lista.add(new Persona(nombre,apellidos,telefono));
                    break;
                case 3:
                    System.out.println("Nombre:");
                    nombre= sc.next();
                    System.out.println("Apellidos:");
                    apellidos= sc.next();
                    System.out.println("Telefono:");
                    telefono= sc.next();
                    System.out.println("En que posicion quieres que vaya?");
                    posicion=sc.nextInt();
                    lista.add(posicion,new Persona(nombre,apellidos,telefono));
                    break;
                case 4:
                    System.out.println("Selecciona la posicion en la que se encuentra");
                    posicion= sc.nextInt();
                    lista.remove(posicion);
                    break;
                case 5:
                    lista.clear();
                    System.out.println("Se han borrado todos los elementos");
                    break;
                case 6:
                    System.out.println("La lista contiene "+lista.size()+" elementos");
                    break;
                case 7:
                    System.out.println("Adios!!!");
                    break;
            }
        }while (opcion!=7);

    }
}
