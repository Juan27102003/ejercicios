package T6;

import java.io.Serializable;

public class Empresa implements Serializable {
    private String razonSocial;
    private String telefono;
    private int anyo;
    private String nombreContacto;

    public Empresa(String razonSocial, String telefono, int anyo, String nombreContacto) {
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.anyo = anyo;
        this.nombreContacto = nombreContacto;
    }

    public Empresa() {
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }
    @Override
    public String toString() {
        return "Empresa{" +
                "razonSocial='" + razonSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", anyo=" + anyo +
                ", nombreContacto='" + nombreContacto + '\'' +
                '}';
    }
}
