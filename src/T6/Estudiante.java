package T6;

import java.io.Serializable;

public class Estudiante implements Serializable {
    private final String nombre;
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

