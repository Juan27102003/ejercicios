package T6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ut7_03_07 {
    static Map<String,Empresa> empresas;
    static String formato="^[A-HJ-NP-W][0-9]{7}";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
            empresas=cargarDatos();
            int opcion;
        try(Scanner sc=new Scanner(System.in)){
            do {
                mostrarMenu();
                opcion= sc.nextInt();
                switch (opcion){
                    case 1:
                        listarEmpresas();
                        break;
                    case 2:
                        buscarEmpresa();
                        break;
                    case 3:
                        crearEmpresa();
                        break;
                    case 4:
                        borrarEmpresa();
                        break;
                    case 5:
                        modificarEmpresa();
                        break;
                    case 0:
                        System.out.println("Adios!!!");
                        break;
                }
            }while (opcion!=0);
        }
    }
    private static void mostrarMenu(){
        System.out.println("Menu");
        System.out.println("1.Listado de empresas");
        System.out.println("2.Buscar empresa");
        System.out.println("3.Alta de una empresa");
        System.out.println("4.Baja de una empresa");
        System.out.println("5.Modificacion de una empresa");
        System.out.println("0.Salir");
    }
    private static void crearEmpresa(){
        Scanner sc=new Scanner(System.in);
        int anyo;
        String CIF,razonSocial,telefono,nombreContacto;
        System.out.println("CIF de la empresa:");
        CIF= sc.next();
        System.out.println("Razon social:");
        razonSocial= sc.next();
        System.out.println("Telefono:");
        telefono= sc.next();
        System.out.println("Nombre de contacto:");
        nombreContacto= sc.next();
        System.out.println("Año:");
        anyo= sc.nextInt();
        Empresa e1=new Empresa(razonSocial,telefono,anyo,nombreContacto);
        if (CIF.matches(formato)){
            empresas.put(CIF,e1);
            guardarDatos(empresas);
        }else System.out.println("Formato del CIF incorrecto");

    }
    private static void listarEmpresas(){
        for (Map.Entry<String,Empresa> o:empresas.entrySet()){
                System.out.println(o);
            }

    }
    private static void borrarEmpresa(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Introduce el CIF:");
            String CIF=sc.next();
            if (empresas.containsKey(CIF)){
                empresas.remove(CIF);
                guardarDatos(empresas);
            }else System.out.println("La empresa no existe");

    }

    private static void buscarEmpresa(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Introduce el CIF:");
            String CIF= sc.next();
            if (empresas.containsKey(CIF)){
                System.out.println(empresas.get(CIF));
            }else System.out.println("La empresa no existe");

    }

    private static void modificarEmpresa(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el CIF:");
        String CIF=sc.nextLine();
        if (empresas.containsKey(CIF)) {
            Empresa e = empresas.get(CIF);
            mostrarMenu2();
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Nuevo dato:");
                    String razonSocial = sc.nextLine();
                    e.setRazonSocial(razonSocial);
                    break;
                case 2:
                    System.out.println("Nuevo dato:");
                    String telefono = sc.nextLine();
                    e.setTelefono(telefono);
                    break;
                case 3:
                    System.out.println("Nuevo dato:");
                    String nombreContacto = sc.nextLine();
                    e.setNombreContacto(nombreContacto);
                    break;
                case 4:
                    System.out.println("Nuevo dato:");
                    int anyo = sc.nextInt();
                    e.setAnyo(anyo);
                    break;
            }
            empresas.putIfAbsent(CIF, e);
            guardarDatos(empresas);
        }else System.out.println("La empresa no existe");
    }
    private static void mostrarMenu2(){
        System.out.println("Menu");
        System.out.println("1.Cambiar razón social");
        System.out.println("2.Cambiar telefono");
        System.out.println("3.Cambiar nombre contacto");
        System.out.println("4.Cambiar año");
    }

    private static Map<String, Empresa> cargarDatos(){
        try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream("empresas.dat"))){
            empresas= (Map<String, Empresa>) ois.readObject();
            return empresas;
        } catch (Exception e) {
            return new HashMap<String,Empresa>();
        }
    }
    private static void guardarDatos(Map<String, Empresa> empresas){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("empresas.dat"))){
            oos.writeObject(empresas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
