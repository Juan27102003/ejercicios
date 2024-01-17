package T5.Figuras;

public class Cuadrado extends FiguraGeometrica{
    public Cuadrado(String nombre, double lado) {
        super(nombre, lado);
    }

    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return 4*lado;
    }
}
