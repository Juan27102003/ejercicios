package T5.Herencia;

public class AnimalMain {
    public static void main(String[] args) {
        Animal a=new Animal("Neo");
        Gato g = new Gato("Kitty", "Siamés");
        Perro p = new Perro("Sultan", "Chihuahua");
        a.emitirSonido();
        g.emitirSonido();
        p.emitirSonido();
    }
}
