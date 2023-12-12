package T3.EjercicioBiblioteca;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca b1=new Biblioteca("Me gustan los libros");
        Scanner sc=new Scanner(System.in);
        int opcion;
        String isbn;
        String titulo;
        String autor;
        do {
            System.out.println("1.Listar libro");
            System.out.println("2.Buscar libro");
            System.out.println("3.Reservar libro");
            System.out.println("4.Devolver libro");
            System.out.println("5.Añadir libro");
            System.out.println("6.Eliminar libro");
            System.out.println("7.Salir");
        opcion=sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println(b1.listarLibro());
                break;
            case 2:
                isbn=sc.next();
                System.out.println(b1.buscarLibro(isbn));
                break;
            case 3:
                isbn=sc.next();
                System.out.println(b1.reservarLibro(isbn));
                break;
            case 4:
                isbn=sc.next();
                System.out.println(b1.devolverLibro(isbn));
                break;
            case 5:
                System.out.println("Isbn:");
                isbn=sc.next();
                System.out.println("Titulo:");
                titulo=sc.next();
                System.out.println("Autor:");
                autor=sc.next();
                Autor autor1=new Autor(autor);
                Libro libro=new Libro(isbn,titulo,autor1);
                b1.aniadirLibro(libro);
                break;
            case 6:
                isbn=sc.next();
                b1.eliminarLibro(isbn);
                break;
            case 7:
                System.out.println("Adios!");
                break;
            default:
                System.out.println("Opcion no valida");
        }

        }while (opcion!=7);
    }
}
