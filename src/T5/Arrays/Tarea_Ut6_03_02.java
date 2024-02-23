package T5.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea_Ut6_03_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        String palabra;
        ArrayList<String> lista=new ArrayList<>();
        do {
            System.out.println("Menu:");
            System.out.println("1.Listar palabras almacendas");
            System.out.println("2.Añadir palabra final lista");
            System.out.println("3.Añadir palabra comienzo de la lista");
            System.out.println("4.Eliminar palabra de la lista");
            System.out.println("5.Devolver numero de elementos");
            System.out.println("6.Eliminar todas las palabras de la lista");
            System.out.println("7.Salir");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    for (String o: lista){
                        System.out.println(o);
                    }
                    break;
                case 2:
                    System.out.println("Palabra:");
                    palabra= sc.next();
                    if (lista.contains(palabra)){
                        System.out.println("La palabra ya esta en la lista en la posicion "+ lista.indexOf(palabra));
                    }else lista.add(palabra);
                    break;
                case 3:
                    System.out.println("Palabra:");
                    palabra= sc.next();
                    if (lista.contains(palabra)){
                        System.out.println("La palabra ya esta en la lista en la posicion "+lista.indexOf(palabra));
                    }else lista.add(0,palabra);
                    break;
                case 4:
                    System.out.println("Palabra:");
                    palabra= sc.next();
                    if (!lista.contains(palabra)) {
                        System.out.println("La palabra no esta en la lista");
                    }else lista.remove(palabra);
                    break;
                case 5:
                    System.out.println("La lista contiene "+lista.size()+" elementos");
                    break;
                case 6:
                    lista.clear();
                    System.out.println("Se han borrado todos los elementos");
                    break;
                case 7:
                    System.out.println("Adios!!!");
                    break;
            }
        }while (opcion!=7);

    }
}
