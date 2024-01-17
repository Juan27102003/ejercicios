package T5.Herencia;

public class Perro extends Animal{
        private String raza;
        public Perro(String nombre, String raza) {
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
            System.out.println(getNombre() + " ha ladrado");
        }
}
