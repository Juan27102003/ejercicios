package T3;

public class RectanguloMain {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(6, 4);
        System.out.println("El rectangulo tiene de base " + r.base + " y de altura " + r.altura);
        System.out.println("El area es " + r.calcularArea());
        System.out.println("El perimetro es " + r.calcularPerimetro());
    }
}
