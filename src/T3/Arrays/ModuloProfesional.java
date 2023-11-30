package T3.Arrays;

import java.util.Objects;

public class ModuloProfesional {
    private int codigo;
    private String descripcion;

    public ModuloProfesional(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModuloProfesional that = (ModuloProfesional) o;
        return codigo == that.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "ModuloProfesional{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
