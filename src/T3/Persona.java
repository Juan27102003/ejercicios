package T3;

public class Persona {
    String nombre;
    String apellidos;
    String dni;

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    int nivelAcceso;
    boolean activo;

    String devolverNombreCompleto() {
        return nombre + " " + apellidos;
    }

    void registrarEntrada() {
        System.out.println(devolverNombreCompleto() + " ha entrado");
    }

    void registrarSalida() {
        System.out.println(devolverNombreCompleto() + " ha salido");
    }

    @Override
    public String toString() {
        return "Esta persona se llama " + devolverNombreCompleto() + " y su dni es " + dni;
    }

    void activar() {
        activo = true;
    }

    void desactivar() {
        activo = false;
    }

    void imprimirDatos() {
        System.out.println("DNI: " + dni + ", Nombre: " + devolverNombreCompleto());
    }
}
