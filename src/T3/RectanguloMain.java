package T3;

public class RectanguloMain {
    public static void main(String[] args) throws Exception {
        Rectangulo r = new Rectangulo(-6, 4);
        System.out.println("El rectangulo tiene de base " + r.base + " y de altura " + r.altura);
        System.out.println("El area es " + r.calcularArea());
        System.out.println("El perimetro es " + r.calcularPerimetro());
        System.out.println();
        Rectangulo r1 = new Rectangulo(6);
        System.out.println("Lado del cuadrado:" + r1.base);
        System.out.println("El area del cuadrado es " + r1.calcularArea());
        System.out.println("El perimetro del cuadrado es " + r1.calcularPerimetro());
    }
}
