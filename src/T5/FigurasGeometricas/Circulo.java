package T5.FigurasGeometricas;

public class Circulo extends FiguraGeometrica{
    private final double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public double getArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public final String getTipoPrincipal() {
        return "Circulo";
    }
    @Override
    public String toString() {
        return "Figura - Circulo de radio " + radio;
    }
}
