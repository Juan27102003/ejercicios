package T5.ObraAudioVisual;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona p1=new Persona("Elmerejildo","Perez");
        Persona p2=new Persona("Federico","Garcia Lorca");
        List<Persona> actores=new ArrayList<>();
        actores.add(p1);
        actores.add(p2);
        Pelicula p=new Pelicula("El ataque de los chamos",560,2,"Pepe Benedicto",actores,"accion");
        System.out.println(p);
    }

}
