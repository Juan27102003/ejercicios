package T3.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    List<ModuloProfesional> modulos;

    public Estudiante(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.modulos=new ArrayList<ModuloProfesional>();
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<ModuloProfesional> getModulos() {
        return List.copyOf(modulos);
    }

    public void setModulos(List<ModuloProfesional> modulos) {
        this.modulos = modulos;
    }
    public void agregarModulos(ModuloProfesional modulo){
    modulos.add(modulo);
    }
    public void eliminarModulos(ModuloProfesional modulo){
        modulos.remove(modulo);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", modulos=" + modulos +
                '}';
    }
}
