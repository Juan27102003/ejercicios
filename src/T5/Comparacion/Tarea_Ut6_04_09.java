package T5.Comparacion;

import java.util.*;

public class Tarea_Ut6_04_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Estudiante>> lista = new TreeMap<>();
        int opcion1, opcion2,posicion;
        String grupo;
        do {
            mostrarMenu1();
            opcion1 = sc.nextInt();
            switch (opcion1) {
                case 1:
                    System.out.println("Nombre del grupo:");
                    grupo = sc.next();
                    if (!lista.containsKey(grupo)) {
                        lista.put(grupo, new ArrayList<Estudiante>());
                        System.out.println("Grupo añadido con exito");
                    } else System.out.println("El grupo ya existe");
                    break;
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("La lista esta vacia");
                    } else {
                        Set<String> keys = lista.keySet();
                        for (String key : keys) {
                            System.out.println(key);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Grupo:");
                    grupo = sc.next();
                    if (lista.containsKey(grupo)) {
                        lista.remove(grupo);
                        System.out.println("Grupo eliminado con exito");
                    } else System.out.println("El grupo no existe");
                    break;
                case 4:
                    System.out.println("Selecciona grupo:");
                    grupo = sc.next();
                    mostrarMenu2();
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println(lista.get(grupo));
                            break;
                        case 2:
                            List<Estudiante> list = new ArrayList<>();
                            list.add(crearEstudiante());
                            lista.put(grupo, list);
                            System.out.println("Estudiante añadido con exito");
                            break;
                        case 3:
                            System.out.println("Selecciona posicion:");
                            posicion = sc.nextInt();
                            lista.get(grupo).add(posicion, crearEstudiante());
                            break;
                        case 4:
                            Collections.sort(lista.get(grupo), new ComparatorDniEstudiante());
                            System.out.println("Se ha ordenado correctamente");
                            break;
                        case 5:
                            System.out.println("Selecciona posicion:");
                            posicion = sc.nextInt();
                            lista.get(grupo).remove(posicion);
                            System.out.println("Se ha borrado correctamente");
                            break;
                        case 6:
                            lista.get(grupo).clear();
                            System.out.println("Se han borrado todos los estudiantes de la clase");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Adios!!!");
                    break;
            }

        } while (opcion1 != 5);
    }

    public static void mostrarMenu1() {
        System.out.println("Menu");
        System.out.println("1.Crear grupos");
        System.out.println("2.Listar grupos");
        System.out.println("3.Eliminar grupos");
        System.out.println("4.Seleccionar grupos");
        System.out.println("5.Salir");
    }

    public static void mostrarMenu2() {
        System.out.println("Menu");
        System.out.println("1.Listar estudiantes del grupo seleccionado");
        System.out.println("2.Añadir un estudiante al final del grupo seleccionado");
        System.out.println("3.Añadir un estudiante en la posición indicada dentro del grupo seleccionado");
        System.out.println("4.Ordenar el listado de estudiantes de un grupo por NIE");
        System.out.println("5.Eliminar el estudiante de la posición indicada");
        System.out.println("6.Eliminar todos los estudiantes de la clase");
    }

    public static Estudiante crearEstudiante() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellidos;
        int nie;
        int edad;
        System.out.println("NIE:");
        nie = sc.nextInt();
        System.out.println("Nombre:");
        nombre = sc.next();
        System.out.println("Apellidos");
        apellidos = sc.next();
        System.out.println("Edad");
        edad = sc.nextInt();
        Estudiante e = new Estudiante(nie, nombre, apellidos, edad);
        return e;
    }
}