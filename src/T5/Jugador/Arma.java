package T5.Jugador;

public class Arma {
    private String nombre;
    private int danio;
    private int alcance;
    private int municion;

    public Arma(String nombre, int danio, int alcance, int municion) {
        this.nombre = nombre;
        this.danio = danio;
        this.alcance = alcance;
        this.municion = municion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }
}
