package T3.EjercicioBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    String nombre;
    List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibro() {
        return libros;
    }

    public void setLibro(List<Libro> libro) {
        this.libros = libro;
    }
    public List<Libro> listarLibro(){
        return List.copyOf(libros);
    }
    public void aniadirLibro(Libro libro1){
        if (!libros.contains(libro1)) libros.add(libro1);
    }
    public Libro buscarLibro(String isbn){
        Libro i=new Libro(isbn);
        if (libros.contains(i)){
            return libros.get(libros.indexOf(i));
        }
        return null;
    }
    public boolean reservarLibro(String isbn){
        Libro libro=buscarLibro(isbn);
        if (!libro.isReservado()){
            libro.setReservado(true);
            return true;
        }
        return false;
    }
    public boolean devolverLibro(String isbn){
        Libro libro=buscarLibro(isbn);
        if (libro!=null && libro.isReservado()){
            libro.setReservado(false);
            return true;
        }
        return false;
    }
    public void eliminarLibro(String isbn){
        Libro libro=buscarLibro(isbn);
        if (libro!=null){
            libros.remove(libro);
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre='" + nombre + '\'' + ", libro=" + libros + '}';
    }
}
