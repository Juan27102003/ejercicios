package T3.EncapsulacionEJ;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private int NIE;

    public Estudiante(String nombre, String apellidos, int NIE) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIE = NIE;
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

    public int getNIE() {
        return NIE;
    }

    public void setNIE(int NIE) {
        this.NIE = NIE;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", NIE=" + NIE +
                '}';
    }
}
