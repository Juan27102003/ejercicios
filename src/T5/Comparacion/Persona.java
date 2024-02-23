package T5.Comparacion;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;

    public Persona(String dni, String nombre, String apellidos, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        int resultado = apellidos.compareTo(o.apellidos);
        if (resultado != 0) {
            return resultado;
        } else {
            resultado=nombre.compareTo(o.nombre);
            if (resultado==0){
                return dni.compareTo(o.dni);
            }
            return resultado;
        }
    }

}
