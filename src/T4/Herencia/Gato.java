package T4.Herencia;

public class Gato extends Animal{
    private String raza;
    public Gato(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " ha maullado");
    }
}
