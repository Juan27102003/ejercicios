package T5.Comparacion;

import java.util.*;

public class ComparacionMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Persona p1=new Persona("23456789J","Juan","Garcia","278904536");
        Persona p2=new Persona("16578903G","Alonso","Garcia","478344536");
        Persona p3=new Persona("56578903G","Pepe","Reina","178344245");
        Persona p5=new Persona("36578903G","Pepe","Reina","378344245");
        Persona p6=new Persona("16578903A","Pepe","Reina","678344245");
        Persona p7=new Persona("66578903G","Pepe","Reina","578344245");
        List<Persona> lista=new ArrayList<>();
        lista.add(p2);
        lista.add(p3);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        System.out.println("1.Ordenar por telefono");
        System.out.println("2.Ordenar por apellidos, nombre y dni");
        int opcion=sc.nextInt();
        switch (opcion){
            case 1:
                Collections.sort(lista,new ComparatorTelefonoPersona());
            break;
                case 2:
                Collections.sort(lista,new ComparatorApellidosPersona());
            break;
        }

        for (Persona p : lista) {
            System.out.println(p);
        }

    }

}
