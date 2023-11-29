package T3.EncapsulacionEJ;

public class Localidad {
    private String nombre;
    private int cod_provincia;

    public Localidad(String nombre, int cod_provincia) {
        this.nombre = nombre;
        this.cod_provincia = cod_provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_provincia() {
        return cod_provincia;
    }

    public void setCod_provincia(int cod_provincia) {
        this.cod_provincia = cod_provincia;
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "nombre='" + nombre + '\'' +
                ", cod_provincia=" + cod_provincia +
                '}';
    }
}
