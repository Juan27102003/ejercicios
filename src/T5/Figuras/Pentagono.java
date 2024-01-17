package T5.Figuras;

public class Pentagono extends  FiguraGeometrica{

    public Pentagono(String nombre, double lado) {
        super(nombre, lado);
    }

    @Override
    public double calcularPerimetro() {
        return 5*lado;
    }

    public static void main(String[] args) {
        Pentagono p =new Pentagono("pe",-1);
        System.out.println(p.lado);
    }
}
