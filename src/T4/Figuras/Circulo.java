package T4.Figuras;

public class Circulo extends FiguraGeometrica{
    public Circulo(String nombre, double lado) {
        super(nombre, lado);
    }

    @Override
    public double calcularArea(){
        return Math.PI*lado*lado;
    }
    @Override
    public double calcularPerimetro(){
        return 2*Math.PI*lado;
    }
}
