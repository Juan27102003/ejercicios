package T4.ObraAudioVisual;

public class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellidos=" + apellidos;
    }
}
