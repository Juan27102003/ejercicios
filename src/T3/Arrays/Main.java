package T3.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ModuloProfesional m1 = new ModuloProfesional(1, "Mates");
        ModuloProfesional m2 = new ModuloProfesional(2, "Lengua");
        ModuloProfesional m3 = new ModuloProfesional(3, "Historia");
        ModuloProfesional m4 = new ModuloProfesional(4, "Fisica");
        Estudiante e1 = new Estudiante("Juan", "Garcia", "26578930G", 20);
        e1.agregarModulos(m1);
        e1.agregarModulos(m2);
        e1.agregarModulos(m3);
        e1.agregarModulos(m4);
        List<ModuloProfesional> modulos = e1.getModulos();
        for (ModuloProfesional m : modulos) {
            System.out.println("Modulos:" + m.getCodigo() + " - " + m.getDescripcion());
        }
        //modulos.add(m4);
        List<ModuloProfesional> modulos2 = e1.getModulos();
        for (int i = 0; i < modulos2.size(); i++) {
            System.out.println("Modulos:" + modulos2.get(i).getCodigo() + " - " + modulos2.get(i).getDescripcion());
        }
        String nombre = e1.getNombre();
        System.out.println("Nombre:" + nombre);
        nombre = "Maria";
        String nombre1 = e1.getNombre();
        System.out.println("Nombre:" + nombre1);
        ModuloProfesional m5 = new ModuloProfesional(1, "Mates");
        e1.agregarModulos(m5);
        e1.eliminarModulos(m5);
        modulos2 = e1.getModulos();
        for (int i = 0; i < modulos2.size(); i++) {
            System.out.println("Modulos:" + modulos2.get(i).getCodigo() + " - " + modulos2.get(i).getDescripcion());
        }
    }
}