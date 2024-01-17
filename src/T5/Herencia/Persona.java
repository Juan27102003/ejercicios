package T5.Herencia;

public class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void entrar() {
        System.out.println(nombre + " ha entrado en el edificio");
    }

    public void salir() {
        System.out.println(nombre + " ha salido en el edificio");
    }
}
