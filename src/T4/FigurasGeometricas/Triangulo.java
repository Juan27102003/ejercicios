package T4.FigurasGeometricas;

public abstract class Triangulo extends FiguraGeometrica {
    protected final double base;
    protected final double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double getArea() {
        return base * altura / 2;
    }

    @Override
    public final String getTipoPrincipal() {
        return "Triangulo";
    }

    public String toString() {
        return "Figura - Triangulo de altura " + altura + " y de base " + base;
    }
}
