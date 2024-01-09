package T5.Jugador;

public class Jugador {
    private String nombre;
    private int vida;
    private int nivel;
    private Arma arma;

    public Jugador(String nombre, int vida, int nivel, Arma arma) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
